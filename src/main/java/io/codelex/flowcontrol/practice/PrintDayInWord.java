package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input day number (0-6): ");
        int dayNumber = in.nextInt();
        PrintDayInWord a = new PrintDayInWord();
        a.printDayUseSwitch(dayNumber);
        a.printDayUseIf(dayNumber);

    }

    private void printDayUseSwitch(int dayNumber) {
        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }
    }
    private void printDayUseIf(int dayNumber){
        String day;
        if(dayNumber == 0){
            day = "Sunday";
        } else if(dayNumber == 1){
            day = "Monday";
        } else if(dayNumber == 2){
            day = "Tuesday";
        } else if(dayNumber == 3){
            day = "Wednesday";
        } else if(dayNumber == 4){
            day = "Thursday";
        } else if(dayNumber == 5){
            day = "Friday";
        } else if(dayNumber == 6){
            day = "Saturday";
        } else {
            day = "Not a valid day!";
        }
        System.out.println(day);
    }


    }



