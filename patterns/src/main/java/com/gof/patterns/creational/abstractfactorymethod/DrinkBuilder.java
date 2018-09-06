package com.gof.patterns.creational.abstractfactorymethod;

public class DrinkBuilder {

    public Drink createDrink(DrinksFactory drinksFactory) {
        return drinksFactory.buildDrink();
    }
}
