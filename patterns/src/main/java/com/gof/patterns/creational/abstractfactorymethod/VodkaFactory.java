package com.gof.patterns.creational.abstractfactorymethod;

public class VodkaFactory implements DrinksFactory {

    @Override
    public Drink buildDrink() {
        return new Vodka();
    }

}