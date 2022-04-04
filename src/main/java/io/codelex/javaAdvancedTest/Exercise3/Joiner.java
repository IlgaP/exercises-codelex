package io.codelex.javaAdvancedTest.Exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public static void main(String[] args) {

        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2, 3, 4));
    }

    public String join(T... elements) {
        return Arrays.stream(elements).map(T::toString).collect(Collectors.joining(separator));

    }


}
