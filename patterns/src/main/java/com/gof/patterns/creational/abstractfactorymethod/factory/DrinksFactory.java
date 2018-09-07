package com.gof.patterns.creational.abstractfactorymethod.factory;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;

public interface DrinksFactory {

    Drink buildDrink();

}
