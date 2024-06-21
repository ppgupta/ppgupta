package com.linkedlist;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class HashMapPractice {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        Set<String> set=people.keySet().stream().sorted().collect(Collectors.toSet());
//        set.stream().sorted();
        for (String i : set) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }


    }

}


