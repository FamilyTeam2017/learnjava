package com.ma.learn.asm;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart:parts){
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }
}
