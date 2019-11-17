package com.fahrizal.adapterpattern.adapter.duck;

public class MalardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quackkkkk");
    }

    @Override
    public void fly() {
        System.out.println("Malard duck flying");
    }
}
