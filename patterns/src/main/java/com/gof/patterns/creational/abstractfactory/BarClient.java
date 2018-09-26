package com.gof.patterns.creational.abstractfactory;

import com.gof.patterns.creational.abstractfactory.drinks.Drink;
import com.gof.patterns.creational.abstractfactory.factory.DrinksFactory;
import com.gof.patterns.creational.abstractfactory.factory.VodkaFactory;
import com.gof.patterns.creational.abstractfactory.factory.WhiskeyFactory;

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
