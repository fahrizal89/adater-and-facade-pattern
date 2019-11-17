package com.fahrizal.adapterpattern.adapter;

import com.fahrizal.adapterpattern.adapter.TurkeyAdapter;
import com.fahrizal.adapterpattern.adapter.duck.Duck;
import com.fahrizal.adapterpattern.adapter.duck.MalardDuck;
import com.fahrizal.adapterpattern.adapter.duck.WildTurkey;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MalardDuck malardDuck = new MalardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);


        malardDuck.fly();
        turkeyAdapter.fly();


    }
}
