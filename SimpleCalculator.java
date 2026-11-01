import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Calculator ---");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("\nResults:");
        System.out.println("Addition (+): " + sum);
        System.out.println("Subtraction (-): " + difference);
        System.out.println("Multiplication (*): " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division (/): " + quotient);
        } else {
            System.out.println("Division (/): Cannot divide by zero.");
        }

        scanner.close();
    }
}