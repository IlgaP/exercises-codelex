package io.codelex.fibonaci;

public class FibonacciSequence {

    // public int getNumber(int index) {
//        if (index == 1) {
//            return 0;
//        } else if (index == 2) {
//            return 1;
//        } else {
//            int firstNumber = 0;
//            int secondNumber = 1;
//            int counter = 0;
//            int result = 0;
//
//            while (counter < index - 2) {
//                result = firstNumber + secondNumber;
//                firstNumber = secondNumber;
//                secondNumber = result;
//                counter++;
//            }
//            return result;
//        }
//    }

    public int getNumber(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Index is wrong!");
        } else if (index <= 2) {
            return index - 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
    }


//    private int getFibonacciNumber(int index) {
//        if (index == 1) {
//            return 0;
//        } else if (index == 2) {
//            return 1;
//        } else {
//            return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
//        }
//    }
}
