package com.gof.patterns.creational.abstractfactorymethod;

import com.gof.patterns.creational.abstractfactorymethod.drinks.Drink;
import com.gof.patterns.creational.abstractfactorymethod.factory.DrinksFactory;
import com.gof.patterns.creational.abstractfactorymethod.factory.VodkaFactory;
import com.gof.patterns.creational.abstractfactorymethod.factory.WhiskeyFactory;

public class BarClient {

    public static void main(String[] args) {
        DrinkBuilder builder = new DrinkBuilder();
        DrinksFactory vFactory = new VodkaFactory();
        Drink drink = builder.createDrink(vFactory);
        drink.testDrink();
        
        Drink whiskeyDrink = builder.createDrink(new WhiskeyFactory());
        whiskeyDrink.testDrink();
    }
    
}
