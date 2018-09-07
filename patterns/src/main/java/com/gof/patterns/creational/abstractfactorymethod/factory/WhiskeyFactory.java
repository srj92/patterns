package com.gof.patterns.creational.abstractfactorymethod.factory;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;
import com.gof.patterns.creational.abstractfactorymethod.drinks.Whiskey;

public class WhiskeyFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Whiskey();
    }

}
