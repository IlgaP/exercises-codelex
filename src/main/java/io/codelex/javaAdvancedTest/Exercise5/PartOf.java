package io.codelex.javaAdvancedTest.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {

    static <T> double partOf(List<T> list, Predicate<T> predicate) {
        return (double) list.stream().filter(predicate).count() / list.size();
    }
}
