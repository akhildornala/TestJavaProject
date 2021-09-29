package com.test;

import java.math.BigDecimal;

public class NullValuesAsBigDecimal {

    public static void main(String args[]) {
        String s = null;
        BigDecimal value = new BigDecimal(s);
        System.out.println(value);
    }
}
