package com.question01;

class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

class MyRunnable implements Runnable {
    private Counter counter;
    
    public MyRunnable(Counter counter) {
        this.counter = counter;
    }
    
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadDemo03 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new MyRunnable(counter));
        Thread thread2 = new Thread(new MyRunnable(counter));
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
    }
}
