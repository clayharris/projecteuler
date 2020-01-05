package com.claydevelops.projecteuler.challenges;

import com.claydevelops.projecteuler.tools.PrimeSupplier;

import java.util.stream.LongStream;

public class Challenge010 implements Runnable {

    @Override
    public void run() {
        long sum = LongStream.generate(new PrimeSupplier())
                .takeWhile(prime -> prime < 2000000)
                .sum();

        System.out.println(sum);
    }
}
