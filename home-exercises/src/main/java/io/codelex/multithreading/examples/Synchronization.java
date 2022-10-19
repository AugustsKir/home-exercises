package io.codelex.multithreading.examples;

public class Synchronization {
    static int staticSum = 0;
    int sum = 0;

    static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }

    synchronized void synchronisedCalculate() {
        sum = sum + 1;
    }

    void performSynchronisedTask() {
        synchronized (this) {
            sum = sum + 1;
        }
    }
}