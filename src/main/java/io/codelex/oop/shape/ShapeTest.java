package io.codelex.oop.shape;

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Rectangle");
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(4, 5, 6, 3);

        System.out.println("Triangle");
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Hexagon hexagon = new Hexagon(6);

        System.out.println("Hexagon");
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());
    }


}
