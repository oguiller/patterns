package com.oguiller.patterns.decorator;


public abstract class Yogurth {

    String type = "Simple Yogurth";

    Integer price = 1;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    protected abstract double cost();

    public String description() {
        return type;
    }
}
