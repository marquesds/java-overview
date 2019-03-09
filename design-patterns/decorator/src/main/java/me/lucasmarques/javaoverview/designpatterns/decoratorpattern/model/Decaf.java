package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class Decaf implements IBeverage {

    public String getDescription() {
        return "Decaf";
    }

    public double getCost() {
        return 2.99;
    }
}
