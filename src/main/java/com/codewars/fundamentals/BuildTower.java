package com.codewars.fundamentals;

import org.springframework.stereotype.Component;

/*
Build a pyramid-shaped tower given a positive integer number of floors. A tower block is represented with "*" character.

        For example, a tower with 3 floors looks like this:

        [
        "  *  ",
        " *** ",
        "*****"
        ]
        And a tower with 6 floors looks like this:

        [
        "     *     ",
        "    ***    ",
        "   *****   ",
        "  *******  ",
        " ********* ",
        "***********"
        ]
*/
@Component
public class BuildTower {

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];

        for (var i = 0; i < nFloors; i++) {
            String lrSpace = " ".repeat(nFloors - i - 1);
            String asterisk = "*".repeat((i * 2) + 1);

            tower[i] = lrSpace.concat(asterisk).concat(lrSpace);
        }

        return tower;
    }

}
