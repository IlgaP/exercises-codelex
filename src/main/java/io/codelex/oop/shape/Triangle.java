package io.codelex.oop.shape;

public class Triangle extends Shape {

    private double sideA;
    private double baseB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double baseB, double sideC, double height) {
        this.sideA = sideA;
        this.baseB = baseB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    double calculatePerimeter() { // a + b + c
        return sideA + sideC + baseB;
    }

    @Override
    double calculateArea() { // (height * base)/2
        return (height * baseB) / 2;
    }
}
