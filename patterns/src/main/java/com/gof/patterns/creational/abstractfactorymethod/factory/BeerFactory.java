package com.gof.patterns.creational.abstractfactorymethod.factory;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Beer;
import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;

public class BeerFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Beer();
    }

}