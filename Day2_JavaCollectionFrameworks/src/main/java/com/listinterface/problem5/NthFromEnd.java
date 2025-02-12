package com.listinterface.problem5;

import java.util.*;

public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> slow = list.iterator();
        Iterator<String> fast = list.iterator();

        // Move fast N steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) return "Invalid N"; // If N is greater than size
            fast.next();
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            slow.next();
            fast.next();
        }

        return slow.next(); // slow now points to the Nth element from end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;

        System.out.println("Nth element from end: " + findNthFromEnd(list, N));
    }
}

