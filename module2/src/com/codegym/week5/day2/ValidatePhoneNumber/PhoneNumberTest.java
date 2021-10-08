package com.codegym.week5.day2.ValidatePhoneNumber;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    public static final String[] checkPhoneNumber = new String[] {"(84)-(0978489648)", "(a8)-(22222222)",
            "(hu)-(1234567889)", "(84)-(6548957860)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String PN: checkPhoneNumber) {
            boolean isvalid = phoneNumber.validate(PN);
            System.out.println("PhoneNumber is: "+PN+" is valid: "+isvalid);
        }
    }
}
