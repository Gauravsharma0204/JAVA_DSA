package Project;

import java.util.Scanner;

public class Calculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== ADVANCED CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. Factorial");
            System.out.println("11. Even / Odd Check");
            System.out.println("12. Prime Check");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Calculator Closed.");
                break;
            }

            switch (choice) {

                case 1 -> binaryOperation("+");
                case 2 -> binaryOperation("-");
                case 3 -> binaryOperation("*");
                case 4 -> binaryOperation("/");
                case 5 -> binaryOperation("%");
                case 6 -> power();
                case 7 -> square();
                case 8 -> cube();
                case 9 -> squareRoot();
                case 10 -> factorial();
                case 11 -> evenOdd();
                case 12 -> primeCheck();

                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    // ---------- Binary Operations ----------
    static void binaryOperation(String op) {
        System.out.print("Enter first number: ");
        long a = sc.nextLong();
        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        switch (op) {
            case "+" -> System.out.println("Result: " + (a + b));
            case "-" -> System.out.println("Result: " + (a - b));
            case "*" -> System.out.println("Result: " + (a * b));
            case "/" -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println("Result: " + (a / b));
                }
            }
            case "%" -> System.out.println("Result: " + (a % b));
        }
    }

    // ---------- Power ----------
    static void power() {
        System.out.print("Enter base: ");
        long base = sc.nextLong();
        System.out.print("Enter exponent: ");
        long exp = sc.nextLong();

        System.out.println("Result: " + Math.pow(base, exp));
    }

    // ---------- Square ----------
    static void square() {
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        System.out.println("Square: " + (n * n));
    }

    // ---------- Cube ----------
    static void cube() {
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        System.out.println("Cube: " + (n * n * n));
    }

    // ---------- Square Root ----------
    static void squareRoot() {
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        System.out.println("Square Root: " + Math.sqrt(n));
    }

    // ---------- Factorial ----------
    static void factorial() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    // ---------- Even / Odd ----------
    static void evenOdd() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }

    // ---------- Prime Check ----------
    static void primeCheck() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
