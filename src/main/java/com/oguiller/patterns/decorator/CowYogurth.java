package com.oguiller.patterns.decorator;

/**
 * Created by Guille on 12/12/16.
 */
public class CowYogurth extends Yogurth {

    CowYogurth() {
        type = "Cow Yogurth";
    }

    protected double cost() {
        return 1.99;
    }
}
