package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public class Soy extends CondimentDecorator {

    public Soy(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.getBeverage().getDescription() + ", Soy";
    }

    public double getCost() {
        return this.getBeverage().getCost() + 3.49;
    }
}
