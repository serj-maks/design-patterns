package edu.serjmaks.patterns.behavioral.chainofresponsibility;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber.Withdraval;
import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Dollar;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("please enter amount to withdraw (max 1000$). " +
                        "Note: you sum must be multiple of 10. " +
                        "Press 'Ctrl + C' to exit");
                int amount = scanner.nextInt();
                if (isValid(amount)) {
                    Withdraval.withdraw(new Dollar(amount));
                }
            } while (true);
        }
    }

    private static boolean isValid(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Try again!");
            return false;
        } else if (amount > 1000) {
            System.out.println("Daily withdrawal limit is 1000$. Try again!");
            return false;
        } else if (amount % 10 != 0) {
            System.out.println("Amount must be mutiple of 10s, Try again!");
            return false;
        }
        return true;
    }
}
