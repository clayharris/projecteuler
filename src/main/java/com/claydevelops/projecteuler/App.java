package com.claydevelops.projecteuler;

import com.claydevelops.projecteuler.challenges.Challenge001;

public class App {
    public static void main(String[] args) {
        Runnable challenge = new Challenge001();

        challenge.run();
    }
}
