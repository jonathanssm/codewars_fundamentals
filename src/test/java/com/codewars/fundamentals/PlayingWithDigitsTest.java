package com.codewars.fundamentals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class PlayingWithDigitsTest {

    @Test
    public void digPowTest1() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }

    @Test
    public void digPowTest2() {
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }

    @Test
    public void digPowTest3() {
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }

}
