package com.sda.final31;

public class KotletRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Zrób kotleta");
    }
}
