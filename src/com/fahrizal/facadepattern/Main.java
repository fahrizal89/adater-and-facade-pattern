package com.fahrizal.facadepattern;

public class Main {

    public static void main(String[] args){
        Projector projector = new Projector();
        Lights lights = new Lights();

        RoomFacade roomFacade = new RoomFacade(projector, lights);

        roomFacade.enterTheRoom();
        roomFacade.exitTheRoom();
    }
}
