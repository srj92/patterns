package com.gof.patterns.creational.abstractfactory;

import com.gof.patterns.creational.abstractfactory.drinks.Drink;
import com.gof.patterns.creational.abstractfactory.factory.DrinksFactory;

public class DrinkBuilder {

    public Drink createDrink(DrinksFactory drinksFactory) {
        return drinksFactory.buildDrink();
    }
}
