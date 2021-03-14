package org.example;

/**
 * Hello world!
 */
public class App {
    private static Object a = new Object();
    private static Object b = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (a) {
                System.out.println(Thread.currentThread() + " get resource a");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get  resource b");
                synchronized (b) {
                    System.out.println(Thread.currentThread() + " get resource b");
                }
            }
        }, "线程 1").start();

        new Thread(() -> {
            synchronized (b) {
                System.out.println(Thread.currentThread() + " get resource b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get  resource a");
                synchronized (a) {
                    System.out.println(Thread.currentThread() + " get resource a");
                }
            }
        }, "线程 2").start();
    }
}
