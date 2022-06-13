package com.example.apple.POJO;

public class Apple {
    private String name = "I am an Apple";

    private double price = 1.99;
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " and my price is " + String.valueOf(getPrice());
    }
}
