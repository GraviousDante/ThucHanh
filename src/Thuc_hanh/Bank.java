package Thuc_hanh;

// Bai 1
public class Bank {
    public double balance;
    public double rate;


    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest(double balance, double rate) {
        return balance * (rate / 1200);
    }
}