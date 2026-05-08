import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user1 = new User("Sumit", "S001", 3);

        user1.accounts[0] = new Account(101, 10000, "Saving");
        user1.accounts[1] = new Account(5001, 1000, "Loan");
        user1.accounts[2] = new Account(1001, 5000, "Investment");

        int acctype, choice, amount;

        while (true) {

            System.out.println("\n---- Select Account ----");
            user1.showAccounts();
            System.out.println("-1. Exit");

            acctype = sc.nextInt();

            if (acctype == -1) break;

            if (acctype < 0 || acctype >= user1.accounts.length) {
                System.out.println("Invalid account!");
                continue;
            }

            Account acc = user1.accounts[acctype-1];

            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n-1. Back");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter amount:");
                        amount = sc.nextInt();

                        // Loan logic handled here
                        if (acc.accountType.equals("Loan")) {
                            acc.withdraw(amount);
                        } else {
                            acc.deposit(amount);
                        }
                        break;

                    case 2:
                        System.out.println("Enter amount:");
                        amount = sc.nextInt();
                        acc.withdraw(amount);
                        break;

                    case 3:
                        acc.checkBal();
                        break;

                }

            } while (choice != -1);
        }

        sc.close();
    }
}
