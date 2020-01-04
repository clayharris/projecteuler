package com.claydevelops.projecteuler.challenges;

public class Challenge006 implements Runnable {
    @Override
    public void run() {
        long sumOfSquares = 0;
        long sumToBeSquared = 0;

        for (int i =1; i <= 100; i++) {
            sumToBeSquared += i;
            sumOfSquares += i * i;
        }

        System.out.println(sumToBeSquared * sumToBeSquared - sumOfSquares);
    }
}
