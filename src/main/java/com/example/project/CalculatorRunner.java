package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calculator= new Calculator("ti84");
        //2. call any methods of that class to test
        System.out.println(calculator.performOperation("+",5,6));
    }
}
