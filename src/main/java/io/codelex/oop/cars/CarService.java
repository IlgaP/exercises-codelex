package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void listOfCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void withEngineV12(EngineType engine) {
        for (Car car : cars) {
            if (car.getEngineType() == engine) {
                System.out.println(car);
            }
        }
    }

    public void before1999(int year) {
        for (Car car : cars) {
            if (car.getYearOfManufacture() < year) {
                System.out.println(car);
            }
        }
    }

    public void mostExpensive() {
        cars.sort((Car car1, Car car2) -> car1.getPrice() - car2.getPrice());
        System.out.println(cars.get(cars.size() - 1));
    }

    public void cheapest() {
        cars.sort((Car car1, Car car2) -> car1.getPrice() - car2.getPrice());
        System.out.println(cars.get(0));
    }

    public void withNManufacturers(int number) {
        for (Car car : cars) {
            if (car.getManufacturer().size() >= number) {
                System.out.println(car);
            }
        }
    }

    public void sortByName(String parameter) {
        if (parameter.equals("ascending")) {
            cars.sort((Car car1, Car car2) -> car1.getName().compareTo(car2.getName()));
            cars.forEach(System.out::println);
        } else {
            cars.sort((Car car1, Car car2) -> car2.getName().compareTo(car1.getName()));
            cars.forEach(System.out::println);
        }
    }

    public void checkIfIsOnList(Car car) {
        if (cars.contains(car)) {
            System.out.println("Car is in the list!");
        } else {
            System.out.println("Car is not in the list!");
        }
    }

    public void manufacturedBy(Scanner input) {
        System.out.println("Enter manufacturer: ");
        String in = input.nextLine();
        boolean found = false;
        found = isFoundCarByManufacturer(in, found);
        if (!found) {
            System.out.println("Nothing found!");
        }
    }

    private boolean isFoundCarByManufacturer(String in, boolean found) {
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturer()) {
                if (in.equals(manufacturer.getName())) {
                    System.out.println(car);
                    found = true;
                }
            }
        }
        return found;
    }

    public List<Car> manufacturedBy(Manufacturer manufacturer) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer1 : car.getManufacturer()) {
                if (manufacturer.equals(manufacturer1)) {
                    carList.add(car);
                }
            }
        }
        return carList;
    }

    public List<Car> manufacturerWithYear(Manufacturer manufacturer, String operator, int year) {
        List<Car> carListByManufacturer = manufacturedBy(manufacturer);
        List<Car> list = new ArrayList<>();
        for (Car car : carListByManufacturer) {
            for (Manufacturer carManufacturer : car.getManufacturer()) {
                switch (operator) {
                    case "<":
                        if (carManufacturer.getYearOfEstablishment() < year) {
                            list.add(car);
                        }
                        break;
                    case ">":
                        if (carManufacturer.getYearOfEstablishment() > year) {
                            list.add(car);
                        }
                        break;
                    case "<=":
                        if (carManufacturer.getYearOfEstablishment() <= year) {
                            list.add(car);
                        }
                        break;
                    case ">=":
                        if (carManufacturer.getYearOfEstablishment() >= year) {
                            list.add(car);
                        }
                        break;
                    case "=":
                        if (carManufacturer.getYearOfEstablishment() == year) {
                            list.add(car);
                        }
                        break;
                    case "!=":
                        if (carManufacturer.getYearOfEstablishment() != year) {
                            list.add(car);
                        }
                        break;
                }

            }
        }

        return list;
    }


}
