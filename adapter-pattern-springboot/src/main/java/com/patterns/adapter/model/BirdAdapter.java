package com.patterns.adapter.model;

public class BirdAdapter implements Bird {
    private Sparrow sparrow;

    public BirdAdapter(Sparrow sparrow) {
        this.sparrow = sparrow;
    }

    @Override
    public void fly() {
        sparrow.fly();
    }

    @Override
    public void makeSound() {
        sparrow.chirp();
    }
}

