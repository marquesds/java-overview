package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class Espresso implements IBeverage {

    public String getDescription() {
        return "Espresso";
    }

    public double getCost() {
        return .99;
    }
}
