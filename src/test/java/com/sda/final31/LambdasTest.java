package com.sda.final31;

import com.sda.final31.excercises.others.Car;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest {

    Function<String, String> upperCase = x -> x.toUpperCase();

    @Test
    void simpleLambda() {

        String txt = "Ala ma kota";
        String txt2 = "Ala ma kota";
        String s = txt.toUpperCase();

        upperCase.apply(txt);
    }

    @FunctionalInterface
    interface FunctionalCalculator {
        int calculate(int a, int b);
    }

    FunctionalCalculator adder = (a, b) -> a + b;
    FunctionalCalculator subtr = (a, b) -> a - b;
    FunctionalCalculator divid = (a, b) -> a / b;
    FunctionalCalculator multi = (a, b) -> a * b;

    int doSth(FunctionalCalculator calculator, int a, int b) {
        return calculator.calculate(a, b);
    }

    @Test
    void calculatorTest() {
        int calculate = adder.calculate(1, 2);
        int result2 = subtr.calculate(1, 2);

        doSth(multi, 2, 3);
        doSth(adder, 2, 3);
        doSth(subtr, 2, 3);
    }

    @FunctionalInterface
    interface HiperCalculator<A, B, R> {
        R calculate(A a, B b);
    }

    HiperCalculator<Integer, Double, BigDecimal> adder2 = (a, b) -> BigDecimal.valueOf(a + b);

    @Test
    void name() {
        BigDecimal calculate = adder2.calculate(1, 1.2);

        List<Car> list = new ArrayList<>();
    }

    class StringList{

    }
    class IntegerList{

    }
}
