package com.oguiller.patterns.factory;

public abstract class PizzaStore {

    // Factory method: We let our subclasses decide what type of pizza
    abstract Pizza createPizza(String type);

    /**
     * @param type the type of pizza we would like to order.
     * @return Pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
