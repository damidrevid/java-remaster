package com.netraenis;

public class Room {
    private int furniture;
    private AC theAc;

    public Room(int furniture, AC theAc) {
        this.furniture = furniture;
        this.theAc = theAc;
    }

    public int getFurniture() {
        return furniture;
    }

    public AC getTheAc() {
        return theAc;
    }


    public void onAc(int a) {
        System.out.println("Now in the room");
        theAc.acSwitch(a);
    }




}
