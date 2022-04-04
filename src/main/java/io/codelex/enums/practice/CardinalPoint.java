package io.codelex.enums.practice;

public enum CardinalPoint {

    North("up", 0),
    South("down", 1),
    East("right", 2),
    West("left", 3);

    final int number;
    private final String direction;

    CardinalPoint(String direction, int number) {
        this.direction = direction;
        this.number = number;
    }

    String getDirection() {
        return direction;
    }

    public int getNumber() {
        return number;
    }

}

