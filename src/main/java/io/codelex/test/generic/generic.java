package io.codelex.test.generic;

public class generic {
    public static void main(String[] args) {

        Integer number = 10;
        printOut(number);

        String text = "Some text";
        printOut(text);

    }

    public static <T> void printOut(T somObject) {
        System.out.println(somObject);
    }

}
