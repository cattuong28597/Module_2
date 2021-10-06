package com.codegym.week4.day5.CopyFile;

import java.io.Serializable;
import java.util.List;

public class CopyFile implements Serializable {
    public static void main(String[] args) {
        ReadAndWriteBinary readAndWriteBinary = new ReadAndWriteBinary();
        List<Object> obj = readAndWriteBinary.readBinary("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\CopyFile\\source1.txt");
        readAndWriteBinary.writeBinary("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\CopyFile\\target1.txt", obj);
    }
}
