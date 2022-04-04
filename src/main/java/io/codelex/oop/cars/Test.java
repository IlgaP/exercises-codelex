package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Manufacturer peugeot = new Manufacturer("Peugeot", 1810, "France");
        Manufacturer opel = new Manufacturer("Opel", 1862, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes-Benz", 1883, "Germany");
        Manufacturer renault = new Manufacturer("Renault", 1899, "France");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer cadillac = new Manufacturer("Cadillac", 1901, "United States");


        Car car1 = new Car("Mercedes-Benz", "GLC", 52925, 2022, EngineType.V8, new ArrayList<>());
        car1.setManufacturer(mercedes); // 1883
        car1.setManufacturer(fiat); // 1899

        Car car2 = new Car("Mercedes-Benz", "AMG", 200000, 2022, EngineType.V12, new ArrayList<>());
        car2.setManufacturer(mercedes); // 1883
        car2.setManufacturer(renault); // 1899
        car2.setManufacturer(peugeot); // 1810

        Car car3 = new Car("Renault", "Megane", 1500, 2006, EngineType.S3, new ArrayList<>());
        car3.setManufacturer(renault);
        car3.setManufacturer(opel);

        Car car4 = new Car("Cadillac", "Deville", 41000, 1996, EngineType.S4, new ArrayList<>());
        car4.setManufacturer(cadillac);

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("Engine V12:");
        carService.withEngineV12(EngineType.V12);

        System.out.println("Before 1999:");
        carService.before1999(1999);

        System.out.println("Most expensive:");
        carService.mostExpensive();

        System.out.println("Cheapest car:");
        carService.cheapest();

        System.out.println("With at least 3 manufacturers:");
        carService.withNManufacturers(3);

        System.out.println("Sort by name");
        String ascending = "ascending";
        String descending = "descending";
        carService.sortByName(ascending);

        System.out.println("Check if is in the list:");
        carService.checkIfIsOnList(car1);
        carService.removeCar(car1);
        System.out.println("Check again if is in the list:");
        carService.checkIfIsOnList(car1);
        carService.addCar(car1);

//        System.out.println("Cars manufactured by a specific manufacturer");
        Scanner input = new Scanner(System.in);
//        carService.manufacturedBy(input);

        System.out.println("Manufacturer:");
        System.out.println(carService.manufacturedBy(renault));

        System.out.println("Cars manufactured by the manufacturer with the year of establishment:");
        System.out.println("Enter year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Operator? ( <, >, <=, >=, =, != ) ");
        String operator = input.nextLine();
        System.out.println(carService.manufacturerWithYear(mercedes, operator, year));


    }
}
