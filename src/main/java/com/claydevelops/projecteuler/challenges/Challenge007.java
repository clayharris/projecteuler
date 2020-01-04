package com.claydevelops.projecteuler.challenges;

import com.claydevelops.projecteuler.tools.PrimeSupplier;

import java.util.function.LongSupplier;

public class Challenge007 implements Runnable {
    @Override
    public void run() {

        LongSupplier primes = new PrimeSupplier();

        for (int i = 0; i < 10000; i++) {
            primes.getAsLong();
        }

        System.out.println(primes.getAsLong());
    }
}
