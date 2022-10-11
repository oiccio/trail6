package com.cc;/*
@author cc
@create:
*/

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;

/**
 * 计算机类
 * @author 陈晨
 */
public class Calculator {
    private int num1;
    private int num2;
    char op;

    public Calculator() {
    }

    public Calculator(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public double cal(int a, int b, char op) throws IOException {
        if (op=='+') {
            return a + b;
        } else if (op=='-') {
            return a - b;
        } else if (op=='*') {
            return a * b;
        } else {
            if (a == 0 || b == 0) {
                throw new IOException();
            } else {
                return a / b;
            }
        }


    }
}
