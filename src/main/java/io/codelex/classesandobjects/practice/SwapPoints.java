package io.codelex.classesandobjects.practice;

import java.awt.*;

public class SwapPoints {

    private int x;
    private int y;

    public SwapPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2){
        int temp = p1.x;
        p1.x = p2.x;
        p2.x =temp;

        temp = p1.y;
        p1.y = p2.y;
        p2.y = temp;

    }

    public static void main(String[] args) {

        Point p1 = new Point(5, 2); // temp 5
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");

    }
}
