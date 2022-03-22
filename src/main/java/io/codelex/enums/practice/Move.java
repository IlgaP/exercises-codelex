package io.codelex.enums.practice;

public enum Move {
    SCISSOR("s"),
    PAPER("p"),
    STONE("t");

    private final String value;

    Move(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}