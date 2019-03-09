package me.lucasmarques.javaoverview.designpatterns.decoratorpattern;

import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model.Milk;
import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model.Mocha;
import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.decorator.model.Soy;
import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model.DarkRoast;
import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model.Decaf;
import me.lucasmarques.javaoverview.designpatterns.decoratorpattern.model.Espresso;
import org.junit.Assert;
import org.junit.Test;

public class TestDecoratorBehavior {

    @Test
    public void testGetEspressoWithMilkCost() {
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);
        Assert.assertTrue(milk.getCost() == 1.98);
    }

    @Test
    public void testGetEspressoWithMilkDescription() {
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);
        Assert.assertTrue(milk.getDescription().equals("Espresso, Milk"));
    }

    @Test
    public void testGetDarkRoastWithDoubleMochaCost() {
        DarkRoast darkRoast = new DarkRoast();
        Mocha mocha1 = new Mocha(darkRoast);
        Mocha mocha2 = new Mocha(mocha1);

        Assert.assertTrue(mocha2.getCost() == 5.97);
    }

    @Test
    public void testGetDarkRoastWithDoubleMochaDescription() {
        DarkRoast darkRoast = new DarkRoast();
        Mocha mocha1 = new Mocha(darkRoast);
        Mocha mocha2 = new Mocha(mocha1);

        Assert.assertTrue(mocha2.getDescription().equals("DarkRoast, Mocha, Mocha"));
    }

    @Test
    public void testGetDecafWithAllAvailableCondimentsCost() {
        Decaf decaf = new Decaf();
        Milk milk = new Milk(decaf);
        Soy soy = new Soy(milk);
        Mocha mocha = new Mocha(soy);

        Assert.assertTrue(mocha.getCost() == 9.46);
    }

    @Test
    public void testGetDecafWithAllAvailableCondimentsDescription() {
        Decaf decaf = new Decaf();
        Milk milk = new Milk(decaf);
        Soy soy = new Soy(milk);
        Mocha mocha = new Mocha(soy);

        Assert.assertTrue(mocha.getDescription().equals("Decaf, Milk, Soy, Mocha"));
    }

}
