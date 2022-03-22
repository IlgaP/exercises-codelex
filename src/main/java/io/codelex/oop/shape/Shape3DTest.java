package io.codelex.oop.shape;

public class Shape3DTest {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 8, 10);
        System.out.println("Cone");
        System.out.println("Area: " + cone.calculateArea());
        System.out.println("Volume: " + cone.calculateVolume());

        Qube qube = new Qube(5);
        System.out.println("Qube");
        System.out.println("Perimeter: " + qube.calculatePerimeter());
        System.out.println("Area: " + qube.calculateArea());
        System.out.println("Volume: " + qube.calculateVolume());
    }
}
