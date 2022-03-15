package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private static final int numSides = 3;
    int width;
    int height;

    public Triangle(int height, int width) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
