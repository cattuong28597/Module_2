package com.codegym.week5.day2.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX_FIRST = "^[a-z]{1}[_a-z0-9]{5,}";
    private static final String ACCOUNT_REGEX_MID = "(?=.*[A-Za-z])[A-Za-z\\d]{6,}$";
    private static final String ACCOUNT_REGEX_LAST = "[_a-z0-9]{5,}[a-z]{1}$";
    public AccountExample() {
    }

    public boolean validate(String regex) {
        boolean isValid = false;
        Pattern patternFirst = Pattern.compile(ACCOUNT_REGEX_FIRST);
        Pattern patternLast = Pattern.compile(ACCOUNT_REGEX_LAST);
        Pattern patternMid = Pattern.compile(ACCOUNT_REGEX_MID);
        Matcher matcherFirst = patternFirst.matcher(regex);
        Matcher matcherLast = patternLast.matcher(regex);
        Matcher matcherMid = patternMid.matcher(regex);

        if (matcherFirst.matches() || matcherLast.matches() || matcherMid.matches()) {
            isValid = true;
        }

        return isValid;
    }
}
