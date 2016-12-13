package com.oguiller.patterns.factory;

public class ItalianPizza extends Pizza {

    public ItalianPizza() {
        name = "Italian Pizza";
        dough = "Thin and crunchy";
        sauce = "The italian tomato sauce, very very Italian!!";

        toppings.add("Original Parminggiano Reggiano");
    }
}
