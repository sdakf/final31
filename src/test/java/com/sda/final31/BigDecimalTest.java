package com.sda.final31;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    void bd() {
        double a = 0.02;
        double b = 0.03;

        System.out.println(a - b);


        BigDecimal aa = new BigDecimal(0.02);
        BigDecimal bb = new BigDecimal(0.03);
        System.out.println(aa.subtract(bb));

        BigDecimal aaa = BigDecimal.valueOf(0.02);
        BigDecimal bbb = BigDecimal.valueOf(0.03);
        System.out.println(aaa.subtract(bbb));
    }
}


