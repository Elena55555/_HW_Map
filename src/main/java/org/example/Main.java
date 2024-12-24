package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

/**
 * A method that returns a set of keys contained in this map
 */
        public static void taskOne () {
            System.out.println("Task first: ");
            HashMap<Integer, String> first = new HashMap<>();
            first.put(1, "one");
            first.put(2, "two");
            first.put(3, "three");
            first.put(4, "four");
            for (Integer key : first.keySet()) {
                System.out.println(key);
            }
        }
        public static void taskTwo() {
            System.out.println(" ");
            System.out.println("Task second: ");
            HashMap<Integer, String> second = new HashMap<>();
            second.put(1, "Red");
            second.put(2, "Green");
            second.put(3, "Black");
            System.out.println("HashMap  before sorting:");
            System.out.println(second);
            System.out.println(" ");

            HashMap<Integer, String> sortedMap = new HashMap<>();
            for (Map.Entry<Integer, String> entry : second.entrySet()) {
                if (entry.getValue().length() > 3) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        System.out.println("HashMap after sorting:");
        System.out.println(sortedMap);
    }
}
