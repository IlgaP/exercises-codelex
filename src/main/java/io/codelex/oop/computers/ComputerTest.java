package io.codelex.oop.computers;

public class ComputerTest {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple M1", 8, "Apple M1", "Apple", "MGND3RU/A");
        Computer computer2 = new Computer("AMD Ryzen", 8, "AMD Radeon RX Vega 6", "HP", "3V5F3EA");

        System.out.println(computer1);

        System.out.println("Modelis: " + computer1.getModel());
        System.out.println("RAM: " + computer1.getRam());

        computer2.setRam(6);
        computer2.setModel("1234");

        System.out.println(computer2);

        System.out.println(computer1.equals(computer2));
        System.out.println(computer2.hashCode());

        Laptop laptop1 = new Laptop("AMD Ryzen", 8, "NVIDIA GeForce GTX 1650 Ti", "Lenovo", "Legion 5 82B500HGPB+1TB", "12 h ");
        Laptop laptop2 = new Laptop("AMD Ryzen", 8, "NVIDIA GeForce GTX 1650 Ti", "Lenovo", "Legion 5 82B500HGPB+1TB", "12 h ");
        Laptop laptop3 = new Laptop("AMD", 8, "NVIDIA GeForce GTX 1650 Ti", "Lenovo", "Legion 5 82B500HGPB+1TB", "12 h ");

        System.out.println(laptop1);

        System.out.println(laptop1.getModel());

        System.out.println("Laptop equals check: ");
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.equals(laptop3));

    }
}
