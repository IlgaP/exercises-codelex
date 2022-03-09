package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {

        Product logitechMouse = new Product("Logitech mouse", 70.00, 13);
        Product iPhone5s = new Product("iPhone 5s", 999.99, 3);
        Product epsonEBU05 = new Product("Epson-U05", 440.46,1);

        logitechMouse.printProduct();
        iPhone5s.printProduct();
        epsonEBU05.printProduct();

        logitechMouse.setAmount(10);
        logitechMouse.printProduct();

        iPhone5s.setPrice(1000);
        iPhone5s.printProduct();

    }
}
