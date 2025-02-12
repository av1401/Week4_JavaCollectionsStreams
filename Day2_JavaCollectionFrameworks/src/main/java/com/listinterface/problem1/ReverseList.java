package com.listinterface.problem1;

import java.util.*;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();  // Create a new list
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));  // Add elements in reverse order
        }
        return reversedList;
    }

    public static void main(String[] args) {
        // Example for ArrayList
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + arrayList);
        System.out.println("Reversed List: " + reverseList(arrayList));

        // Example for LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }
}
