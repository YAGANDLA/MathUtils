package tests;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
            return (-1.0);
        } else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        // Example usage of the MathUtils class
        MathUtils calculator = new MathUtils();

        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(8, 4);
        int product = calculator.multiply(2, 6);
        double quotient = calculator.divide(10, 2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

