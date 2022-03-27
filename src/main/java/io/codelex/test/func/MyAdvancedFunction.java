package io.codelex.test.func;

@FunctionalInterface
public interface MyAdvancedFunction<T> {

    T calculate(T param);
}
