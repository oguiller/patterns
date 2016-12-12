package com.oguiller.patterns.decorator;

public class BlueBerry extends ToppingDecorator {

    Yogurth yogurth;
    String name;

    BlueBerry(Yogurth yogurth) {
        this.yogurth = yogurth;
        this.name = "BlueBerry";
    }

    public String description() {
        return yogurth.getType() + name;
    }

    public double cost() {
        return 1.0 + yogurth.cost();
    }
}
