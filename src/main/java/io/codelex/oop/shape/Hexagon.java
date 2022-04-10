package io.codelex.oop.shape;

public class Hexagon extends Shape {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() { // 6 * side
        return 6 * side;
    }

    @Override
    double calculateArea() { // (3 * sqrt(3) * side*side)/2
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
