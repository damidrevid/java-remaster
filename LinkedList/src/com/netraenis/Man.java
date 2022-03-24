package com.netraenis;

public class Man {

    private String head;
    private String shoulder;
    private String knees;
    private String toes;
    private String hands;

    public Man(String head, String shoulder, String knees, String toes, String hands) {
        this.head = head;
        this.shoulder = shoulder;
        this.knees = knees;
        this.toes = toes;
        this.hands = hands;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getKnees() {
        return knees;
    }

    public void setKnees(String knees) {
        this.knees = knees;
    }

    public String getToes() {
        return toes;
    }

    public void setToes(String toes) {
        this.toes = toes;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public boolean move(int direction, int speed) {
        if((direction > 0) && (speed > 0)){
            int move = direction * speed;
            return true;
        }
        return false;
    }

    public boolean eat(String food, boolean hungry){
        if(hungry){
            System.out.println("I'd like to eat " + food);
            return true;
        }else {
            System.out.println("Keep the " + food);
            return false;
        }
    }
}
