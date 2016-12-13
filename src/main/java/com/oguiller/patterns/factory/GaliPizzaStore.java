package com.oguiller.patterns.factory;

public class GaliPizzaStore extends PizzaStore {


    public Pizza createPizza(String type) {

        Pizza pizza;

        switch (type.toLowerCase()) {
            case "lacon":
                pizza = new LaconConGrelosPizza();
                break;
            default:
                pizza = new GaliPizza();
                break;
        }

        return pizza;

    }

}
