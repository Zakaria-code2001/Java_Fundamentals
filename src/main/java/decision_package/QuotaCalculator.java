package decision_package;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Enter the number of sales made");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota) {
            System.out.println("Congratulations! You have met your quota!");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota!\n" +
                    "You were " + salesShort + " sales short.");
        }

    }
}
