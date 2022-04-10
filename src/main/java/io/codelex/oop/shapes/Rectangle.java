package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private static final int NUM_SIDES = 4;
    int width;
    int height;

    public Rectangle(int width, int height) {
        super(NUM_SIDES);
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
