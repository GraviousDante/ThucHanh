package Thuc_hanh;

public class Main {
    public static void main(String[] args){
        // Client borrowed $1000, and annual interest rate is 10 percent
        Bank bank1 = new Bank(1000, 10);
        double interest = bank1.calculateInterest(bank1.balance,bank1.rate);
        System.out.println("Your interest is: " + Math.round(interest*100.0)/100.0);
    }
}