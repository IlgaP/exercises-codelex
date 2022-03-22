package io.codelex.oop.shape;

public class Qube extends Shape3D {

    private double edge;

    public Qube(double edge) {
        this.edge = edge;
    }

    @Override
    double calculatePerimeter() { // 12 * edge
        return 12 * edge;
    }

    @Override
    double calculateArea() {  // 6 * edge *edge
        return 6 * Math.pow(edge, 2);
    }

    @Override
    double calculateVolume() { // edge * edge *edge
        return Math.pow(edge, 3);
    }
}
