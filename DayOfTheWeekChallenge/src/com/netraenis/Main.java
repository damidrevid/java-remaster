package com.netraenis;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDaysOfTheWeek(9);

    }

    public static void printDayOfTheWeek(int day) {
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("This is not a valid day of the week");
            }
        }

        public static void printDaysOfTheWeek(int days){

            if(days == 0){
                System.out.println("Sunday");
            }
            else if(days==1) {
                System.out.println("Monday");
            }
            else if(days==2){
                System.out.println("Tuesday");
            }
            else if(days==3){
                System.out.println("Wednesday");
            }
            else if(days==4){
                System.out.println("Thursday");
            }
            else if(days==5){
                System.out.println("Friday");
            }
            else if(days==6){
                System.out.println("Saturday");
            }
            else {
                System.out.println("This is not a valid day of the week");
            }

        }

}
