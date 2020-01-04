package com.claydevelops.projecteuler.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongSupplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimeSupplier implements LongSupplier {

    private List<Long> primes = new ArrayList<>();
    private long maxPrime;

    @Override
    public long getAsLong() {
        if (primes.isEmpty()) {
            maxPrime = 2;
            primes.add(maxPrime);
            return maxPrime;
        }
        if (maxPrime == 2) {
            maxPrime = 3;
            primes.add(maxPrime);
            return 3;
        }
        long candidateIter = maxPrime;
        while(true) {
            candidateIter += 2;
            long candidate = candidateIter;
            if (primes.stream().noneMatch(prime -> candidate % prime == 0)) {
                maxPrime = candidate;
                primes.add(maxPrime);
                return maxPrime;
            }
        }


    }
}
