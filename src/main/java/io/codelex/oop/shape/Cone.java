package io.codelex.oop.shape;

public class Cone extends Shape3D {

    private double r;
    private double h;
    private double s;

    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {  // pi r^2 + pi*r*s
        return Math.PI * Math.pow(r, 2) + Math.PI * r * s;
    }

    @Override
    double calculateVolume() { //  1/3 * pi*r^2*h
        return 1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h;
    }
}
