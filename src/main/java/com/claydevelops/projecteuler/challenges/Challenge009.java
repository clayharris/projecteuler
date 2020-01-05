package com.claydevelops.projecteuler.challenges;

public class Challenge009 implements Runnable {
    @Override
    public void run() {
        for (int c = 998; c > 0; c--) {
            for (int a = 1; 1000 - c - a > 0; a++) {
                int b = 1000 - c - a;
                if (Math.sqrt(a*a + b*b) == c) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
