package com.codewars.fundamentals;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds <= 359999) {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = seconds % 60;

            return dateFormat(hours, minutes, seconds);
        }

        return dateFormat(0, 0, 0);
    }

    private static String dateFormat(int hours, int minutes, int seconds) {
        return String.format("%s:%s:%s", putLeftPad(hours), putLeftPad(minutes), putLeftPad(seconds));
    }

    private static String putLeftPad(int number) {
        return StringUtils.leftPad(String.valueOf(number), 2, "0");
    }

}
