package com.codegym.week3.day5.LinkedHashMap;

import com.codegym.week3.day5.DifferenceCompare.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Person p1 = new Person("Smith", 23, "E");
        Person p2 = new Person("John", 26, "U");
        Person p3 = new Person("Anne", 25, "W");
        Person p4 = new Person("Anderson", 26, "U");
        Person p5 = new Person("Cook", 25, "W");

//        Map<Integer, Person> hashMap = new HashMap<>();
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith", 30);
//        hashMap.put("Cook", 30);
//        hashMap.put("Anderson", 31);
//        hashMap.put("Jame", 32);
//        hashMap.put("Lewis", 29);
//        hashMap.put("Cook", 29);


        Map<Integer, Person> hashMap = new HashMap<>();
//        hashMap.put(40, p1);
//        hashMap.put(30, p2);
//        hashMap.put(31, p3);
//        hashMap.put(32, p4);
//        hashMap.put(29, p5);
//        hashMap.put(30, p5);
        hashMap.put(44, p4);
        hashMap.put(41, p1);
        hashMap.put(42, p2);
        hashMap.put(43, p3);
        hashMap.put(29, p5);
        hashMap.put(30, p5);



//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(40, "Smith");
//        hashMap.put(30, "Cook");
//        hashMap.put(31, "Anderson");
//        hashMap.put(32, "Jame");
//        hashMap.put(35, "Lewis");
//        hashMap.put(29, "Cook");

        System.out.println("Display entries in HashMap");
        System.out.println("\n" + hashMap);
//        for (Map.Entry <Integer,Person> person: hashMap.entrySet()) {
//            System.out.println( person.toString());
//        }

//        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        Map<Integer, Person> treeMap = new TreeMap<>(hashMap);
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
        Map<Integer, Person> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(40, p1);
        linkedHashMap.put(30, p2);
        linkedHashMap.put(31, p3);
        linkedHashMap.put(32, p4);
        linkedHashMap.put(29, p5);
        linkedHashMap.put(30, p5);
        linkedHashMap.put(32, p1);
//        System.out.println("\nThe age for " + "Lewis is "+linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);

    }
}
