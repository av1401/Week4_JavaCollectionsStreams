package com.SetInterface;

import java.util.*;

public class CompareSets {
    public static void main(String[] args) {
        //create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Are the sets equal ? :  " + set1.equals(set2));
    }
}

