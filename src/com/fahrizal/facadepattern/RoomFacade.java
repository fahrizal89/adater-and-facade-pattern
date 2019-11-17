package com.fahrizal.facadepattern;

public class RoomFacade {
    Switchable[] switchables;

    public RoomFacade(Switchable... switchables) {
        this.switchables = switchables;
    }

    public void enterTheRoom(){
        for (Switchable switchable : switchables) {
            switchable.on();
        }
    }

    public void exitTheRoom(){
        for (Switchable switchable : switchables) {
            switchable.off();
        }
    }
}
