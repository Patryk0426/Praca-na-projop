import java.util.Scanner;


class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nie można dzielić przez zero.");
            return Double.NaN;
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }


    public static double squareRoot(double number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            System.out.println("Nie można obliczyć pierwiastka z liczby ujemnej.");
            return Double.NaN;
        }
    }
}