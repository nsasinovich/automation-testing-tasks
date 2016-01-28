package com.mycompany.calculator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println(calculate(args));
    }

    public static String calculate(String... args) {
        if(args.length!=3){
            return "Invalid number of arguments!";
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        switch (args[1].charAt(0)){
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                return "Unknown operation!";
        }
    }

    private static String add(double a, double b){return String.valueOf(a + b);}
    private static String subtract(double a, double b){return String.valueOf(a - b);}
    private static String multiply(double a, double b){return String.valueOf(a*b);}
    private static String divide(double a, double b){return String.valueOf(a / b);}
}


