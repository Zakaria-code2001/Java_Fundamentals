package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of products you want to purchase: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0.0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the price for product ");
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();
        System.out.println("The total is $" + total);
    }
}
