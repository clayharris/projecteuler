package com.claydevelops.projecteuler.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge005 implements Runnable {
    @Override
    public void run() {
        List<Integer> factors = List.of(4, 4, 5, 3, 3, 19, 17, 7,13, 11);

        int num = 1;
        for (int factor : factors) {
            num = num * factor;
        }

        System.out.println(num);
    }
}
