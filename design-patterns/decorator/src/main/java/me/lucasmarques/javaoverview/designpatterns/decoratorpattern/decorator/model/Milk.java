package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class Milk extends CondimentDecorator {

    public Milk(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.getBeverage().getDescription() + ", Milk";
    }

    public double getCost() {
        return this.getBeverage().getCost() + .99;
    }
}
