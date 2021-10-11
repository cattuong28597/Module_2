package com.codegym.week4.day5.Check;

import java.io.File;

public class FileInJava {
    public static void main(String[] args) {
        //File f = new File("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\Check\\foo.txt");
        File dir = new File("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\Check\\abc");
        dir.mkdir();
        System.out.println(dir.getAbsolutePath());
        boolean isDelete = dir.delete();
    }
}
