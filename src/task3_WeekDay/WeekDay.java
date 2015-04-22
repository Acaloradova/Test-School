package task3_WeekDay;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 7 to find out weed day.Use 0 for exit");
        while (true) {
            String dayn = in.next();
            int day;
            try {
                day = Integer.parseInt(dayn);
            } catch (NumberFormatException e) {
                System.out.println("No such day in a week. Enter number 1-7. Use 0 for exit");
                continue;
            }
            String dayStr = parseWeekDay(day);
            if (day == 0) {
                System.out.println("Exiting..");
                break;
            }
            if (dayStr == null) {
                System.out.println("No such day in a week. Enter number 1-7. Use 0 for exit");
            } else System.out.println("week day #" + day + " is " + dayStr);


        }
    }

    private static String parseWeekDay(int day) {
        String dayStr;
        switch (day) {
            case 1:
                dayStr = "Monday";
                break;
            case 2:
                dayStr = "Tuesday";
                break;
            case 3:
                dayStr = "Wednesday";
                break;
            case 4:
                dayStr = "Thursday";
                break;
            case 5:
                dayStr = "Friday";
                break;
            case 6:
                dayStr = "Saturday";
                break;
            case 7:
                dayStr = "Sunday";
                break;
            default:
                dayStr = null;
        }
        return dayStr;
    }
}

