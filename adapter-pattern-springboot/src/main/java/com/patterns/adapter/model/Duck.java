package com.patterns.adapter.model;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck is quacking");
    }
}

