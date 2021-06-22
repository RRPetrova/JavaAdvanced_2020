package _03BankAccount;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        BankAccount bankAccount = null;
        HashMap<Integer, BankAccount> clientList = new HashMap<>();

        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");

            if (tokens[0].equals("Create")) {
                bankAccount = new BankAccount();
                clientList.put(bankAccount.getId(), bankAccount);
                System.out.printf("Account ID%d created%n", bankAccount.getId());

            } else if (tokens[0].equals("Deposit")) {
                if (clientList.containsKey(Integer.parseInt(tokens[1]))) {
                    bankAccount = clientList.get(Integer.parseInt(tokens[1]));
                    bankAccount.deposit(Double.parseDouble(tokens[2]));
                    System.out.printf("Deposited %.0f to ID%d%n", Double.parseDouble(tokens[2]), bankAccount.getId());
                } else {
                    System.out.println("Account does not exist");
                }

            } else if (tokens[0].equals("SetInterest")) {
                bankAccount.setIntRate(Double.parseDouble(tokens[1]));
            } else if (tokens[0].equals("GetInterest")) {
                if (clientList.containsKey(Integer.parseInt(tokens[1]))) {
                    bankAccount = clientList.get(Integer.parseInt(tokens[1]));
                    System.out.printf("%.2f%n", bankAccount.getInterest(Integer.parseInt(tokens[2])));
                } else {
                    System.out.println("Account does not exist");
                }
            }
            cmd = scanner.nextLine();
        }

    }
}
