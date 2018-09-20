package com.greenfoxacademy.bankofsimba.utils;

public class BooleanUtil {
    public static String booleanToString(Boolean bool) {
        if (bool == null)
            return "Unknown";
        else if (bool)
            return "Yes";
        else
            return "No";
    }
}
