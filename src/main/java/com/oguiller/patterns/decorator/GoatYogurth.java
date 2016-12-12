package com.oguiller.patterns.decorator;

public class GoatYogurth extends Yogurth {

    GoatYogurth() {
        type = "Goat's Yogurth";
    }

    protected double cost() {
        return 2.5;
    }
}
