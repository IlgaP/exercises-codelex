package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double ensKilometers;
        double liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        ensKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, ensKilometers, liters);

        if(car.gasHog()){
            System.out.println("Car is a gas hog");
        } else if(car.economyCar()){
            System.out.println("Car is economic");
        } else{
            System.out.println("Average car");
        }
        //Car car2 = new Car(100, 215, 25);


        System.out.println("Kilometers per liter are "+ car.calculateConsumption());
        //System.out.println("Kilometers per liter are "+ car2.calculateConsumption());

    }
}
