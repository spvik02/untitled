package org.example;

import by.lvcorp.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setNumBefore(3);
        calculator.setNumCurrent(5);
        calculator.setOperator("+");
        System.out.println(calculator.getResult());
    }
}