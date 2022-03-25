package io.codelex.test;

public class MainProgramForFunction {
    public static void main(String[] args) {

        MyAdvancedFunction<Integer> myFunction = (Integer number) -> number * 2;
        System.out.println(myFunction.calculate(10));


    }
}
