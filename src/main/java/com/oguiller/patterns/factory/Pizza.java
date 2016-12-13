package com.oguiller.patterns.factory;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("PREPARING " + name);
        System.out.println("TOSSING DOUGH ..." + dough);
        System.out.println("ADDING SAUCE ... " + sauce);
        System.out.println("ADDING TOPPINGS:  ");

        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 30 min at 200");
    }

    void cut() {
        System.out.println("Cutting the pizza in perfect diagonal slices");
    }

    void box() {
        System.out.println("Boxing the pizza");
    }

    public String getName() {
        return name;
    }
}
