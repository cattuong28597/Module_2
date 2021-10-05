package com.codegym.week4.day4.CopyFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
      List<Integer> numbers = new ArrayList<>();
      try {
          File file = new File(filePath);

          if (!file.exists()) {
              throw new FileNotFoundException();
          }

          BufferedReader br = new BufferedReader(new FileReader(file));
          String line = "";
          while ((line = br.readLine()) != null) {
              numbers.add(Integer.parseInt(line));
          }
      } catch (Exception e) {
          System.out.println("File khong ton tai hay noi dung co loi");
      }
      return numbers;
    }

    public void writeFile(String filePath, List<Integer> numbers) {
        try{
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Integer num:numbers) {
                bufferedWriter.write(num.toString()+"\n");
            }
           bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
