package com.SetInterface;

import java.util.*;

public class SortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert Set to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort List in ascending order
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}
