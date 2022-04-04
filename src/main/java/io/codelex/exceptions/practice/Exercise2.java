package io.codelex.exceptions.practice;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();

        exercise2.methodA();
    }

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(new Throwable().getStackTrace()));
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(new Throwable().getStackTrace()));
            throw e;
        }
    }

    public void methodC() throws ArithmeticException {
        int numerator = 12;
        int divisor = 0;
        try {
            int result = numerator / divisor;
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(new Throwable().getStackTrace()));
            throw new ArithmeticException("/ by zero");
        }
    }
}
