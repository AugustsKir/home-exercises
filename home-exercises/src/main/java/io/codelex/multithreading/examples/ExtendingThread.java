package io.codelex.multithreading.examples;

public class ExtendingThread extends Thread {
    public static void main(String[] args) {
        ExtendingThread obj = new ExtendingThread();
        obj.start();
    }

    public void run() {
        System.out.println("It is alive!");
    }
}
