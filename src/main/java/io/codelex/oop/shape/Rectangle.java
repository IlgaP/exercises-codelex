package io.codelex.oop.shape;

public class Rectangle extends Shape {

    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (x + y);
    }

    @Override
    double calculateArea() {
        return x * y;
    }
}
