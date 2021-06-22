package _03BankAccount;

public class BankAccount {
    private final static double default_interestRatePerYear = 0.02;
    private static double intRate = default_interestRatePerYear;
    private static int idCount = 1;

    private int id;
    private double balance;

    BankAccount() {
        this.id = idCount++;
    }

    public int getId() {
        return this.id;
    }

    public static void setIntRate(double intRate) {
        BankAccount.intRate = intRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
   }

   public  double getInterest(int years) {
        return BankAccount.intRate * years * this.balance;
   }

}
