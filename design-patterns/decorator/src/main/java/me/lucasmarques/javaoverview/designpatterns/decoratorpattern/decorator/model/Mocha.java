package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class Mocha extends CondimentDecorator {

    public Mocha(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.getBeverage().getDescription() + ", Mocha";
    }

    public double getCost() {
        return this.getBeverage().getCost() + 1.99;
    }
}
