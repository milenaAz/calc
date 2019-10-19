package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        char operator = 0;

        Calculator calc = new Calculator();
        Scanner readLine = new Scanner(System.in);

        System.out.print("Give first number: ");
        a = readLine.nextDouble();
        System.out.print("Choose operator: ");
        operator = readLine.next().charAt(0);
        System.out.print("Give second number: ");
        b = readLine.nextDouble();

        if(operator == '+') {
            System.out.println(calc.add(a, b));
        }
        else if(operator == '-') {
            System.out.println(calc.subtract(a, b));
        }
        else if(operator == '*') {
            System.out.println(calc.multiply(a, b));
        }
        else if(operator == '/') {
            System.out.println(calc.divide(a, b));
        }
        else {
            System.out.println("Wrong operator");
        }

    }
}
