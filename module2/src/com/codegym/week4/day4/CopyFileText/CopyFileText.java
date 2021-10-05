package com.codegym.week4.day4.CopyFileText;

import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day4\\CopyFileText\\source file.txt");
        readAndWriteFile.writeFile("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day4\\CopyFileText\\target file.txt", numbers);
    }
}
