package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class CarChangedTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double liters = 10;

        System.out.print("Enter start Odometer reading: ");
        startKilometers = scan.nextDouble();

        CarChanged car = new CarChanged(startKilometers, liters);

        double nowKilometers;

        do {
            System.out.println("Filling up the tank!");
            System.out.print("Enter current odometer reading: ");
            nowKilometers = scan.nextDouble();

            System.out.print("Enter liters filled: ");
            liters = scan.nextDouble();

            car.fillUp((int) nowKilometers, liters);

            System.out.println("Kilometers per liter are " + car.calculateConsumption());

            if (car.gasHog()) {
                System.out.println("Car is a gas hog");
            } else if (car.economyCar()) {
                System.out.println("Car is economic");
            } else {
                System.out.println("Average car");
            }

        } while (nowKilometers != 0);



    }
}
