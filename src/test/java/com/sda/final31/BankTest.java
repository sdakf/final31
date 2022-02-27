package com.sda.final31;

import com.sda.final31.excercises.threads.Bank;
import com.sda.final31.excercises.threads.ClientOperations;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BankTest {

    @Test
    void sequentially() {
        List<ClientOperations> actions = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            actions.add(new ClientOperations());
        }
        for (ClientOperations action : actions) {
            action.run();
        }
        System.out.printf("Końcowy balans banku: " + Bank.getBankBalance());
    }

    @Test
    void threads() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(new ClientOperations()));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Końcowy balans banku: " + Bank.getBankBalance());
        System.out.println("Ilość operacji: " + Bank.getCounter());
    }
}