package io.codelex.oop.Exercise1;

public class TestShapes {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();

        Triangle triangle = new Triangle(5, 4);
        System.out.println("Triangle");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
