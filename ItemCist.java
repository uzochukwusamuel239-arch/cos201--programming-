import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Item Cost Calculator ---");
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per unit: ");
        double pricePerUnit = scanner.nextDouble();

        double totalCost = quantity * pricePerUnit;

        System.out.printf("\nTotal cost for %d %s(s) is: $%.2f\n", quantity, itemName, totalCost);

        scanner.close();
    }
}