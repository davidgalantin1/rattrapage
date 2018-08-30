package fr.epsi;

public class App {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(substraction(4, 1));
        System.out.println(division(1, 2));
        System.out.println(division(1, 0));
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double substraction(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return a / b;
    }
}
