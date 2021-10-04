package com.codegym.week4.day4.SumInFileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = " + sum);
        } catch (Exception e) {
            System.err.println("File khong ton tai hay noi dung co loi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Duong dan file: ");
        String path = "D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day4\\SumInFileText\\SumText.txt";
        ReadFileExample readFile = new ReadFileExample();
        readFile.readFileText(path);
    }
}
