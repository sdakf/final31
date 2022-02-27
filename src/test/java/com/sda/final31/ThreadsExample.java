package com.sda.final31;

import org.junit.jupiter.api.Test;

public class ThreadsExample {

    @Test
    void simpleThreads() {
        System.out.println(Thread.currentThread().getName() + " Wuja zaczyna zamawiać: POPROSZĘ OBIAD!");
        KotletRunnable kotletRunnable = new KotletRunnable();
        Runnable ziemniakiRunnable = new Runnable() { //klasa anonimowa
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Zrób ziemniaki");
            }
        };
        Runnable surowkaRunnable = () -> System.out.println(Thread.currentThread().getName() + " Zrób sałatkę"); //lambda

        Thread t1 = new Thread(kotletRunnable);
        Thread t2 = new Thread(ziemniakiRunnable);
        Thread t3 = new Thread(surowkaRunnable);

        t1.start(); //start zamiast run - run wykona operację w danym wątku
        t2.start();
        t3.start();

    }
}
