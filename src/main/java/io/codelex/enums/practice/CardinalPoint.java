package io.codelex.enums.practice;

public enum CardinalPoint {

    North("up", 0),
    South("down", 1),
    East("right", 2),
    West("left", 3);

    final String direction;
    final int number;

    CardinalPoint(String direction, int number) {
        this.direction = direction;
        this.number = number;
    }

    String direction() {
        return direction;
    }

    int number() {
        return number;
    }
}

