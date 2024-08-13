package com.promineotech;
import java.util.Random;

public class TestDemo {
    /**
     * Adds two positive integers.
     * @param a the first positive integer
     * @param b the second positive integer
     * @return the sum of a and b
     * @throws IllegalArgumentException if either a or b is not positive
     */
    public int addPositive(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        } else {
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
    }

    /**
     * Subtracts a smaller positive integer from a larger or equal positive integer.
     * @param a the larger or equal positive integer
     * @param b the smaller positive integer
     * @return the result of a - b
     * @throws IllegalArgumentException if a is not greater than or equal to b, or if either is not positive
     */
    public int subtractGreaterPositive(int a, int b) {
        if (a > 0 && b > 0 && a >= b) {
            return a - b;
        } else {
            throw new IllegalArgumentException("a must be greater than or equal to b, and both must be positive!");
        }
    }

    public int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public int randomNumberSquared() {
        int result = getRandomInt();
        return result * result;
    }
}
