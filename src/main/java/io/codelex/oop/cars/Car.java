package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturer;
    private EngineType engineType;

    public Car(String name, String model, int price, int yearOfManufacture, EngineType engineType, List<Manufacturer> manufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
        this.manufacturer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer.add(manufacturer);
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price
                && yearOfManufacture == car.yearOfManufacture
                && Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(manufacturer, car.manufacturer)
                && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturer, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                ", engineType=" + engineType +
                '}';
    }
}
