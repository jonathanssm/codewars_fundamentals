package com.codewars.fundamentals;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildTowerTest {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }
    
}
