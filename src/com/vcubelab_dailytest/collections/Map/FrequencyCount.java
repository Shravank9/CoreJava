package com.vcubelab_dailytest.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class FrequencyCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> map = new HashMap<>();

        System.out.println("Enter a String");
        String s = sc.nextLine();

        char[] c = s.toCharArray();

        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Entry<Character, Integer>> set = map.entrySet();

        for (Entry<Character, Integer> entry : set) {
            System.out.println("Character: " + entry.getKey()
                    + ", Frequency: " + entry.getValue());
        }

        sc.close();
    }
}