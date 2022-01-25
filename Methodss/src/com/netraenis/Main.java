package com.netraenis;

public class Main {
    public static void main(String[] args) {

        int highScore = calcScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);
        int highScorre = calcScore(true, 10000, 9, 1500);
        System.out.println("Your final score is " + highScorre);

        int position = calcHighScorePosition(1500);
        displayHighScorePosition("Damilare", position);
//        System.out.println("The High score position is " + position);
        position = calcHighScorePosition(900);
        displayHighScorePosition("Omosalewa", position);

        position = calcHighScorePosition(400);
        displayHighScorePosition("Felix", position);

        position = calcHighScorePosition(50);
        displayHighScorePosition("Badmus", position);
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(!gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else
            return -1;
    }

    public static void displayHighScorePosition(String studName, int position) {
        System.out.println(studName + " managed to get into position " + position + " on the High Score Table.");
    }

    public static int calcHighScorePosition(int score) {
//        if(score >= 1000){
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;   //Or...
        int position = 4;

        if (score >=1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;
    }


}

