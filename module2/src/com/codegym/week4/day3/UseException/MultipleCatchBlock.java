package com.codegym.week4.day3.UseException;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int []a = new int[5];
            System.out.println(a[5]);
//            a[4] = 30 / 0;
//            String s = null;
//            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+ e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally");
        }
    }
}
