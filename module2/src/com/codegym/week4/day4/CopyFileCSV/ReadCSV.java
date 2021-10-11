package com.codegym.week4.day4.CopyFileCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        String fileName = "D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day4\\CopyFileCSV\\Countries1.csv";
        List<String> list = new ArrayList<>();
        try{
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("1");
            bufferedWriter.write(";");
            bufferedWriter.write("AU");
            bufferedWriter.write(";");
            bufferedWriter.write("Australia");
            bufferedWriter.write("\n");
            bufferedWriter.write("2;CN;China");
            bufferedWriter.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
