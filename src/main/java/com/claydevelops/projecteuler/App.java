package com.claydevelops.projecteuler;

import com.claydevelops.projecteuler.challenges.Challenge001;
import com.claydevelops.projecteuler.challenges.Challenge002;

public class App {
    public static void main(String[] args) {
        Runnable challenge = new Challenge002();

        challenge.run();
    }
}
