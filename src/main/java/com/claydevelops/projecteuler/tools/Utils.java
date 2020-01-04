package com.claydevelops.projecteuler.tools;

public final class Utils {

    public static boolean isPalindrome(Number number) {
        char[] numChars = number.toString().toCharArray();

        for (int i = 0; i <= numChars.length / 2; i++) {
            if (numChars[i] != numChars[numChars.length - (i + 1)]) return false;
        }
        return true;
    }
}
