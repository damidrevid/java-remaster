package com.netraenis;

public class Main {

    private static final String ERROR_MESSAGE = "invalid Values";

    public static void main(String[] args) {

        // Pass your arguments to the overloaded methods here.
        String time =  getDurationString(2000,61);
        System.out.println(time);

        String time2 =getDurationString(500000);
        System.out.println(time2);
    }

    private static String getDurationString(long minutes, long seconds) {

        if((minutes >= 0) && (seconds >= 0)) {
//        if((minutes >= 0) && (seconds > 0) && (seconds <= 60)) {

        // The algorithm
            long temp_minute = minutes + (seconds / 60);
            long myMinute = temp_minute % 60;
            long mySeconds = seconds % 60;
            long hours = temp_minute / 60;
            long days = hours/24;
            long myHours = hours % 24;

        //Handling Display format for Single digit time.
            String dayHandler = "Day: ";
            if (days > 1) {
                dayHandler = "Days: ";
            }

            String daysString = days + dayHandler;
            if (days < 10) {
                daysString = "0" + daysString;
            }

            String hoursString = myHours + "Hr: ";
            if (myHours < 10) {
                hoursString = "0" + hoursString;
            }

            String secondsString = mySeconds + "Sec.";
            if (mySeconds < 10) {
                secondsString = "0" + secondsString;
            }

            String minutesString = myMinute + "Min: ";
            if (myMinute < 10) {
                minutesString = "0" + minutesString;
            }


        // Pushing out the result
            return "The appropriate format for " + minutes + "min and " + seconds + "sec is: " + daysString + hoursString
                    + minutesString + secondsString;
        }
    // If the condition is not met, we throw an error!
        else { return ERROR_MESSAGE;
        }

    }

    // Another method calling the first.
    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return ERROR_MESSAGE;
        }

            long mySeconds = seconds%60;

            long minutes = (seconds/60);

            return getDurationString(minutes, mySeconds);

    }
}

