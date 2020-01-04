package com.claydevelops.projecteuler.tools;

import java.util.function.LongSupplier;

public class FibonacciSupplier implements LongSupplier {

    private long firstTerm;
    private long secondTerm;

    @Override
    public long getAsLong() {
        if (secondTerm == 0) {
            secondTerm = 1;
            return 1;
        }
        long result = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = result;
        return result;
    }
}
