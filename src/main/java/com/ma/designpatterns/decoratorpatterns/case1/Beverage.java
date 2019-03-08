package com.ma.designpatterns.decoratorpatterns.case1;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
