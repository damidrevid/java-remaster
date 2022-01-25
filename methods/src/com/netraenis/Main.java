package com.netraenis;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score  was less than 5k");
        }
        else if(score < 1000){
            System.out.println("Your score is less than 1k");
        }
        else{
            System.out.println("Got here!");
        }

        if(!gameover) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        if(gameover) {
            score =10000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("You second final score is " + secondScore);
        }
    }
}
