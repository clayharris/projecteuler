package com.claydevelops.projecteuler.challenges;

import javax.xml.transform.stream.StreamSource;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class Challenge001 implements Runnable {
    @Override
    public void run() {
        Set<Integer> multiples = new HashSet<>();
        int sum1 = IntStream.range(1, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
        System.out.println(sum1);


    }
}
