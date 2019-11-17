package com.fahrizal.adapterpattern.adapter;

import com.fahrizal.adapterpattern.adapter.duck.Duck;
import com.fahrizal.adapterpattern.adapter.duck.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
