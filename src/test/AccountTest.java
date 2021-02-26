package test;

import java.util.Scanner;
import app.Account;

/**
 * Tester from Figure 3.9 on page 85
 */

public class AccountTest {
    public static void main(String[] args) throws Exception {
        System.out.println("**********************************");
        System.out.println("Welcome to the Bank Account Tester");
        System.out.println("**********************************\n\n");

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s starting balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s starting balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("%n adding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());


        input.close();
    }
}
