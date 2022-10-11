package com.cc.test;/*
@author cc
@create:
*/

import com.cc.Calculator;
import org.junit.Test;

import java.io.IOException;

public class Mytest {
    @Test
    public  void test1() throws IOException {
        Calculator calculator = new Calculator();
        double cal = calculator.cal(1, 1, '+');
        System.out.println(cal);

    }

}
