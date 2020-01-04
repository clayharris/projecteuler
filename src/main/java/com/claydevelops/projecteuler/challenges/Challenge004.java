package com.claydevelops.projecteuler.challenges;

import com.claydevelops.projecteuler.tools.Utils;

public class Challenge004 implements Runnable {
    @Override
    public void run() {
        System.out.println("Challenge 4 - https://projecteuler.net/problem=4");

        int max = 0;

        for (int i = 999; i > 0; i--) {
            for (int j = 999; j >= i; j--) {
                int product = i * j;
                if (Utils.isPalindrome(product)) {
                    if (product > max) {
                        max = product;
                        break;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
