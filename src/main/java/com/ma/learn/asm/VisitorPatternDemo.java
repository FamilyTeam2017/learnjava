package com.ma.learn.asm;

/**
 * 参考文档:
 * http://www.runoob.com/design-pattern/visitor-pattern.html
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
