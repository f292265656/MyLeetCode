package com.test;

import org.junit.Test;

import com.algorithm.AddDigits;

public class TestAddDigits {

    @Test
    public void testAddDigits() {
        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);
        System.out.println(i7 == i8);
    }

    @Test
    public void testAddDigitsByMath() {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigitsByMath(1234567));
    }

}
