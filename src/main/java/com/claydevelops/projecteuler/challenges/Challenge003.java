package com.claydevelops.projecteuler.challenges;

import com.claydevelops.projecteuler.tools.PrimeSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalLong;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Challenge003 implements Runnable {


    @Override
    public void run() {
        long number = 600851475143L;

        long numberSqRt = (long)Math.sqrt(number);
        List<Long> factors = new ArrayList<>();

        OptionalLong max = LongStream.generate(new PrimeSupplier())
                .takeWhile(prime -> prime <= numberSqRt)
                .filter(prime -> number % prime == 0)
                .max();

        System.out.println(max.getAsLong());


    }
}
