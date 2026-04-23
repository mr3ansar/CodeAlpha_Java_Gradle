package com.codealpha;

public class App {
    public static void main(String[] args) {
        System.out.println("=== CodeAlpha Java App — Built with Gradle ===");

        Calculator calc = new Calculator();

        System.out.println("Addition:       5 + 3  = " + calc.add(5, 3));
        System.out.println("Subtraction:   10 - 4  = " + calc.subtract(10, 4));
        System.out.println("Multiplication: 3 * 5  = " + calc.multiply(3, 5));
        System.out.println("Division:       9 / 2  = " + calc.divide(9, 2));
        System.out.println("=============================================");
    }
}