package com.netraenis;

import java.util.ArrayList;

public class SmallMan<Organs> {
    private int age;
    private ArrayList<Organs> theOrgan;

    public SmallMan(int age) {
        this.age = age;
        this.theOrgan = new ArrayList<Organs>();
    }
}
