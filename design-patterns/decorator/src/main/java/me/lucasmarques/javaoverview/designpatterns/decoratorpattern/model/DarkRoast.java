package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class DarkRoast implements IBeverage {

    public String getDescription() {
        return "DarkRoast";
    }

    public double getCost() {
        return 1.99;
    }

}
