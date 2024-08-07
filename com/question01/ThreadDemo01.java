package com.question01;

class MyThread extends Thread {
    public void run() {
        // new thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        // new thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}