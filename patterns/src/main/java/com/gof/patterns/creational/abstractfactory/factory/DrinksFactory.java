package com.gof.patterns.creational.abstractfactory.factory;

import com.gof.patterns.creational.abstractfactory.drinks.Drink;

public interface DrinksFactory {

    Drink buildDrink();

}
