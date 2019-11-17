package com.fahrizal.adapterpattern.adapter.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble.. Gobble..");
    }

    @Override
    public void fly() {
        System.out.println("turkey flyingggg");
    }
}
