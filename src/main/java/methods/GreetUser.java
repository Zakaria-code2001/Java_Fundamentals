package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    public static String getUserName() {
        System.out.println("Enter Your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}