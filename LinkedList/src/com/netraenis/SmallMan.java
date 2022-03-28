package com.netraenis;

import java.util.ArrayList;
import java.util.List;

public class SmallMan<Organs> implements Human {
    private int age;
    private List<Organs> theOrgan;

    public SmallMan(int age) {
        this.age = age;
        this.theOrgan = new ArrayList<Organs>();
    }

    @Override
    public void race() {

    }

    @Override
    public void colour() {

    }
}
