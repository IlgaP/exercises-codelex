package io.codelex.arithmetic.practice;

//import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        return radius.multiply(new BigDecimal(2*Math.PI)).doubleValue();
        //throw new NoCodeWrittenException();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width).doubleValue();
        //throw new NoCodeWrittenException();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).multiply(new BigDecimal("0.5")).doubleValue();
        //throw new NoCodeWrittenException();
    }
}
