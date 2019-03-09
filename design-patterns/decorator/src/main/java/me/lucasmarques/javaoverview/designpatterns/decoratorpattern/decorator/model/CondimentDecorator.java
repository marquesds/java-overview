package me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.definition.IBeverage;

public abstract class CondimentDecorator implements IBeverage {

    private IBeverage beverage;

    public CondimentDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
    public abstract double getCost();

    public IBeverage getBeverage() {
        return beverage;
    }
}
