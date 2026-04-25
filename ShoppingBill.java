import java.util.Scanner;

public class ShoppingBill {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Customer ID
        System.out.print("Enter customer ID: ");
        int customerID = input.nextInt();

        // Item prices
        System.out.print("Enter price of item 1: ");
        double item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = input.nextDouble();

        System.out.print("Enter price of item 4: ");
        double item4 = input.nextDouble();

        // Quantity
        System.out.print("Enter quantity of item 1: ");
        int q1 = input.nextInt();

        System.out.print("Enter quantity of item 2: ");
        int q2 = input.nextInt();

        System.out.print("Enter quantity of item 3: ");
        int q3 = input.nextInt();

        System.out.print("Enter quantity of item 4: ");
        int q4 = input.nextInt();

        // Calculations
        double total1 = item1 * q1;
        double total2 = item2 * q2;
        double total3 = item3 * q3;
        double total4 = item4 * q4;

        double subtotal = total1 + total2 + total3 + total4;

        // Tax (5%)
        double tax = subtotal * 0.05;

        // Discount (10%)
        double discount = subtotal * 0.10;

        // Final total
        double finalTotal = subtotal + tax - discount;

        // Average cost per item
        int totalItems = q1 + q2 + q3 + q4;
        double averageCost = finalTotal / totalItems;

        // Output
        System.out.println("\n------ SHOPPING BILL ------");
        System.out.println("Customer ID: " + customerID);

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Tax (5%): $" + tax);
        System.out.println("Discount (10%): $" + discount);
        System.out.println("Final Total: $" + finalTotal);

        System.out.println("Total Items: " + totalItems);
        System.out.println("Average Cost per Item: $" + averageCost);
    }
}