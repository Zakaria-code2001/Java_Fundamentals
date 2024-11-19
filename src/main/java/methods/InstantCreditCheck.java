package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requireSalary = 25000;
    static int requireCreditScore = 700;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = getSalary(sc);
        int creditScore = getCreditScore(sc);
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);

        sc.close();
    }

    private static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats! You have been approved.");
        } else {
            System.out.println("You have not been approved.");
        }
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requireSalary && creditScore >= requireCreditScore;
    }

    public static double getSalary(Scanner sc) {
        System.out.println("Enter your salary:");
        return sc.nextDouble();
    }

    public static int getCreditScore(Scanner sc) {
        System.out.println("Enter your credit score:");
        return sc.nextInt();
    }
}
