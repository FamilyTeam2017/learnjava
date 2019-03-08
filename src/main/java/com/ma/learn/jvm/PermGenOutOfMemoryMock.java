package com.ma.learn.jvm;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class PermGenOutOfMemoryMock {
    public static void main(String[] args) {
        URL url = null;
        List<ClassLoader> classLoaderList = new ArrayList<>();
        try{
            url = new File("C:\\Users\\maxiaogang\\IdeaProjects").toURI().toURL();
            URL[] urls = {url};
            while (true){
                ClassLoader loader = new URLClassLoader(urls);
                classLoaderList.add(loader);
                loader.loadClass("com.ma.learn.jvm.StackErrorMock");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
