package com.gof.patterns.creational.abstractfactory.factory;

import com.gof.patterns.creational.abstractfactory.drinks.Drink;
import com.gof.patterns.creational.abstractfactory.drinks.Vodka;

public class VodkaFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Vodka();
    }

}