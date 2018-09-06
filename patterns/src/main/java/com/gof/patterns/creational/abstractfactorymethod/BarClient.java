package com.gof.patterns.creational.abstractfactorymethod;

public class BarClient {

    public static void main(String[] args) {
        DrinkBuilder builder = new DrinkBuilder();
        DrinksFactory vFactory = new VodkaFactory();
        Drink drink = builder.createDrink(vFactory);
        drink.testDrink();
    }
    
}
