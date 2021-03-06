package com.codegym.week5.day2.ValidateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public Class() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

//        return Pattern.compile(CLASS_REGEX).matcher(regex).matches();
    }
}
