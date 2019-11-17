package com.fahrizal.facadepattern;

public class Lights implements Switchable{
    @Override
    public void on(){
        System.out.println("turnOff");
    }

    @Override
    public void off(){
        System.out.println("turnOff");
    }

    public void dim(int count){
        System.out.println("dim"+count);
    }
}
