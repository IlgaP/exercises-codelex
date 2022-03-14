package io.codelex.oop.Exercise1;

public class Rectangle extends Shape {

    private static final int numSides = 4;
    int width;
    int height;

    public Rectangle(int width, int height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }
}
