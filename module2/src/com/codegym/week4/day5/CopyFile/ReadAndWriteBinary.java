package com.codegym.week4.day5.CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary implements Serializable {
    public static List<Object> readBinary(String path) {
        List<Object> obj = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (List<Object>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
           // e.printStackTrace();
        }
        return obj;
    }

    public static void writeBinary(String path, List<Object> obj) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
