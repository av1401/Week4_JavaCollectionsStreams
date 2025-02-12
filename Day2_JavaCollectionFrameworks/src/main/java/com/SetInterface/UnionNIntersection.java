package com.SetInterface;

import java.util.*;

public class UnionNIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Union (all unique elements)
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);  // Adds all elements from set2

        // Intersection (common elements)
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);  // Keeps only common elements

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
