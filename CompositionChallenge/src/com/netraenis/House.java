package com.netraenis;

public class House {
    private Room theRoom;
    private int sittingRoom;

    public House(Room theRoom, int sittingRoom) {
        this.theRoom = theRoom;
        this.sittingRoom = sittingRoom;
    }

    public Room getTheRoom() {
        return theRoom;
    }

    public int getSittingRoom() {
        return sittingRoom;
    }
}
