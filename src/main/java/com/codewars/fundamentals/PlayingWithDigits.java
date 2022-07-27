package com.codewars.fundamentals;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PlayingWithDigits {

    /*
    Some numbers have funny properties. For example:

            89 --> 8¹ + 9² = 89 * 1

            695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2

            46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

    Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p

    we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
    In other words:

    Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k

    If it is the case we will return k, if not return -1.

    Note: n and p will always be given as strictly positive integers.
    */
    public static long digPow(int n, int p) {
        String[] arrayString = Arrays.stream(String.valueOf(n).split("")).toArray(String[]::new);
        int result = 0;

        for (int i = 0; i < arrayString.length; i++) {
            int number = Integer.valueOf(arrayString[i]);
            result += Math.pow(number, p + i);
        }

        int x = (int) Math.pow(n, p);
        if (result == x) {
            return p;
        } else if (result % n == 0) {
            return result / n;
        } else {

        }

        return -1;
    }

}
