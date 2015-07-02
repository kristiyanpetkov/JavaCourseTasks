package com.clouway.intro.task1task2;

/**
 * Created by clouway on 15-5-4.
 */

public class Euclid {


    /**
     * @param x
     * @param y
     * @return Greatest common divisor of x and y.
     */

    public int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);

    }

    /**
     * @param x
     * @param y
     * @return Least common multiple of x and y.
     */


    public int lcm(int x, int y) {

        return (x * y) / gcd(x, y);

    }

}

