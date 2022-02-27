package com.sda.final31.excercises.threads;

import com.sda.final31.excercises.threads.Bank;

public class ClientOperations implements Runnable{
    @Override
    public void run() {
        Bank.withdraw(600);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bank.deposit(600);
    }
}
