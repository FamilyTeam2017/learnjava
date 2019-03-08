package com.ma.learn.jvm;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTransformer implements ClassFileTransformer {

    final static String prefix = "\nlong startTime = System.currentTimeMillis();\n";
    final static String postfix = "\nlong startTime = System.currentTimeMillis();\n";

    final static Map<String, List<String>> methodMap = new HashMap<String, List<String>>();

    public MyTransformer() {
        add("com.ma.learn.HelloWorld.sayHello");
        add("com.ma.learn.HelloWorld.sayHello2");
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        className = className.replace("/", ".");
        if (methodMap.containsKey(className)){
            CtClass ctClass = null;
            try {
                ctClass = ClassPool.getDefault().get(className);
                for (String methodName : methodMap.get(className)){
                    String outputStr = "\nSystem.out.println(\"this method " + methodName + " cost:\" + (endTime - startTime) + \" ms.\");";
                    CtMethod ctMethod = ctClass.getDeclaredMethod(methodName);//得到这方法实例
                    String newMethodName = methodName + "$old";//新定义一个方法,sayHello$old
                    ctMethod.setName(newMethodName);//将原来的方法名字修改

                    //创建新方法
                    CtMethod newMethod = CtNewMethod.copy(ctMethod, methodName, ctClass, null);

                    //构建新的方法体
                    StringBuilder bodyStr = new StringBuilder();
                    bodyStr.append("{");
                    bodyStr.append(prefix);
                    bodyStr.append(newMethodName + "($$);\n");//调用原有代码,类似method();($$)表示所有的参数
                    bodyStr.append(postfix);
                    bodyStr.append(outputStr);
                    bodyStr.append("}");

                    newMethod.setBody(bodyStr.toString());
                    ctClass.addMethod(newMethod);
                }
                return ctClass.toBytecode();
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
        return null;
    }

    private void add(String methodString){
        String className = methodString.substring(0, methodString.lastIndexOf("."));
        String methodName = methodString.substring(methodString.lastIndexOf(".") + 1);
        List<String> list = methodMap.get(className);
        if (list == null){
            list = new ArrayList<>();
            methodMap.put(className, list);
        }
        list.add(methodName);
    }
}
