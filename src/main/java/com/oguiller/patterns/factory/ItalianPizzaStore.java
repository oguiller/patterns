package com.oguiller.patterns.factory;

public class ItalianPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        return new ItalianPizza();
    }
}
