package com.gof.patterns.creational.abstractfactorymethod;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;
import com.gof.patterns.creational.abstractfactorymethod.factory.DrinksFactory;

public class DrinkBuilder {

    public Drink createDrink(DrinksFactory drinksFactory) {
        return drinksFactory.buildDrink();
    }
}
