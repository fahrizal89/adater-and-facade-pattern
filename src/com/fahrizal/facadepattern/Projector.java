package com.fahrizal.facadepattern;

public class Projector implements Switchable{
    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }

    public void wideScreen(boolean wideScreen){
        System.out.println("display "+ (wideScreen?"wide screen":"normal") );
    }
}
