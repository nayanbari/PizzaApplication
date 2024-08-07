package com.question01;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                // sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        
        try {
            thread1.join(); // Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread resumes after thread1 completes.");
    }
}
