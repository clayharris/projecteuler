package com.claydevelops.projecteuler;

import com.claydevelops.projecteuler.challenges.Challenge003;
import com.claydevelops.projecteuler.tools.PrimeSupplier;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class App {
    public static void main(String[] args) {
        Runnable challenge = new Challenge003();

        challenge.run();



    }
}
