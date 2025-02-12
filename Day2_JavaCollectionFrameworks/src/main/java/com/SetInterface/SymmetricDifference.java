package com.SetInterface;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Copy original sets to avoid modifying them
        Set<Integer> diff1 = new HashSet<>(set1);
        Set<Integer> diff2 = new HashSet<>(set2);

        // Remove common elements
        diff1.removeAll(set2);  // Elements in set1 but not in set2
        diff2.removeAll(set1);  // Elements in set2 but not in set1

        // Merge both differences
        diff1.addAll(diff2);

        System.out.println("Symmetric Difference: " + diff1);
    }
}

