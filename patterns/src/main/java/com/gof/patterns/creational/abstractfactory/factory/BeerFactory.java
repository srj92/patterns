package com.gof.patterns.creational.abstractfactory.factory;

import com.gof.patterns.creational.abstractfactory.drinks.Beer;
import com.gof.patterns.creational.abstractfactory.drinks.Drink;

public class BeerFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Beer();
    }

}