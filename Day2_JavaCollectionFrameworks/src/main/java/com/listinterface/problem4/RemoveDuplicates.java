package com.listinterface.problem4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + list);

        // Using LinkedHashSet to remove duplicates and maintain order
        Set<Integer> seen = new LinkedHashSet<>(list);

        // Display unique elements directly
        System.out.println("List After Removing Duplicates: " + seen);
    }
}