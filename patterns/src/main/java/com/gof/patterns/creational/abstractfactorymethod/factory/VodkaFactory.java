package com.gof.patterns.creational.abstractfactorymethod.factory;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;
import com.gof.patterns.creational.abstractfactorymethod.drinks.Vodka;

public class VodkaFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Vodka();
    }

}