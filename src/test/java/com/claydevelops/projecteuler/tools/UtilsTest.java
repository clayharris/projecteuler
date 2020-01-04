package com.claydevelops.projecteuler.tools;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;



public class UtilsTest {


    @Test
    public void isPalindrome9009ShouldReturnTrue() {
        assertTrue(Utils.isPalindrome(9009));
    }


    @Test
    public void isPalindrome90509ShouldReturnTrue() {
        assertTrue(Utils.isPalindrome(90509));
    }

    @Test
    public void isPalindrome9059ShouldReturnFalse() {
        assertFalse(Utils.isPalindrome(9059));
    }

    @Test
    public void isPalindrome950ShouldReturnFalse() {
        assertFalse(Utils.isPalindrome(950));
    }


}
