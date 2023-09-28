package org.example;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs, Comparator.comparing(String::length));

        if(strs.length == 0) {

            return "";

        }

        var firstStrLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {

            strs[i] = strs[i].substring(0, firstStrLength);

        }

 

        while (!strs[0].isEmpty()) {

            if (Arrays.stream(strs).skip(1).allMatch(s -> strs[0].equals(s))) {

                return strs[0];

            }

            firstStrLength--;

            for (int i = 0; i < strs.length; i++) {

                strs[i] = strs[i].substring(0, firstStrLength);

            }

        }

        return "";
    }
}
