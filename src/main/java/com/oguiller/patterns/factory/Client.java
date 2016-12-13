package com.oguiller.patterns.factory;

/**
 * The Factory Method Pattern defines an interface for creating an object,
 * but lets subclasses decide which class to instantiate.
 */
public class Client {

    public static void main(String args[]) {
        PizzaStore galiPizzaStore = new GaliPizzaStore();

        Pizza pizza = galiPizzaStore.orderPizza("lacon");
        System.out.println("You have ordered: " + pizza.getName());

        System.out.println("#### NEXT ORDER ####");

        PizzaStore italianPizzaStore = new ItalianPizzaStore();
        pizza = italianPizzaStore.orderPizza("");
        System.out.println("You have ordered: " + pizza.getName());
    }
}
