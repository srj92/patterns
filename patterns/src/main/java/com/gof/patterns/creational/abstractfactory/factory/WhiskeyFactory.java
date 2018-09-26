package com.gof.patterns.creational.abstractfactory.factory;

import com.gof.patterns.creational.abstractfactory.drinks.Drink;
import com.gof.patterns.creational.abstractfactory.drinks.Whiskey;

public class WhiskeyFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Whiskey();
    }

}
