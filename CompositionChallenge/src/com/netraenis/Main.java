package com.netraenis;

public class Main {

    public static void main(String[] args) {
        AC myRoomAC = new AC("Samsung", 1,1,false);
        Room myRoom = new Room(4, myRoomAC);

        myRoom.getTheAc().acSwitch(0);

        myRoom.onAc(1);
    }
}
