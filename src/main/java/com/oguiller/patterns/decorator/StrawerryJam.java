package com.oguiller.patterns.decorator;

/**
 * Created by Guille on 12/12/16.
 */
public class StrawerryJam extends ToppingDecorator {

    String name;
    Yogurth yogurth;


    StrawerryJam(Yogurth yogurth) {
        this.yogurth = yogurth;
        name = "Strawberry Jam";
    }

    public String description() {
        return yogurth.description() + name;
    }

    public double cost() {
        return 0.5 + yogurth.cost();
    }
}
