package com.claydevelops.projecteuler.challenges;

import com.claydevelops.projecteuler.tools.FibonacciSupplier;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Challenge002 implements Runnable {
    @Override
    public void run() {
        long sum = LongStream.generate(new FibonacciSupplier())
                .takeWhile(i -> i < 4000000)
                .filter(i -> i % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
