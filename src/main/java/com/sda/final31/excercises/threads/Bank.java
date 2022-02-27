package com.sda.final31.excercises.threads;

public class Bank {

    private static int bankBalance = 1000;
    private static int counter = 0;

    public static int getBankBalance() {
        return bankBalance;
    }

    public static synchronized void withdraw(int amount) {
        bankBalance = bankBalance - amount;
        System.out.println("Withdraw " + amount + " , balans = " + bankBalance);
    }

    public static synchronized void deposit(int amount) {
        bankBalance = bankBalance + amount;
        counter++;
        System.out.println("Deposit " + amount + " , balans = " + bankBalance);
    }

    public static int getCounter() {
        return counter;
    }
}
