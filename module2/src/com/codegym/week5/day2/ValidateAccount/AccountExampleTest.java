package com.codegym.week5.day2.ValidateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] {"123abc5", "8abc123", "______",
            "123456", "abcdefgh", "a12345", "12345a", "12s456"};
    public static final String[] invalidAccount = new String[] {".@", "1234", "123_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is: " + account + " is valid: "+ isvalid);
        }
        for (String account: invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is: "+ account+ " is valid: "+isvalid);
        }
    }
}
