package io.codelex.test.func;

import java.util.function.UnaryOperator;

public class MainProgramForFunction {
    public static void main(String[] args) {

        UnaryOperator<Integer> multiplyByTwo = (Integer number) -> number * 2;
        UnaryOperator<Integer> plusThree = (Integer number) -> number + 3;
        UnaryOperator<Integer> plusNine = (Integer number) -> number + 9;
        UnaryOperator<Integer> addTwo = MainProgramForFunction::addTwoToNumber;

        Integer r = calculate(10, multiplyByTwo, plusNine, plusThree, addTwo, plusNine);
        System.out.println(r);

//        MyAdvancedFunction<Integer> myFunction = (Integer number) -> number * 2;
//        System.out.println(myFunction.calculate(10));
//
//        doCalculations(myFunction);
//        doCalculations((Integer n) -> n * 12);


    }

    public static Integer calculate(Integer number, UnaryOperator<Integer>... functions) {
        Integer result = number;
        for (UnaryOperator<Integer> function : functions) {
            result = function.apply(result);
        }
        return result;
    }

    public static Integer addTwoToNumber(Integer a) {
        return a + 2;
    }

//    public static void doCalculations(MyAdvancedFunction<Integer> myFunction) {
//        System.out.println(myFunction.calculate(30));
//
//    }
}
