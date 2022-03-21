package io.codelex.enums.practice;

public class Main {
    public static void main(String[] args) {

        for (CardinalPoints point : CardinalPoints.values()
        ) {
            System.out.println(point + ":" + point.direction + ":" + point.number);
        }


    }
}
