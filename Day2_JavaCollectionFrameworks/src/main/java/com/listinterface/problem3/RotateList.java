package com.listinterface.problem3;

import java.util.*;

public class RotateList {
    public static List<Integer> rotateList(List<Integer> list, int indexOfRotation) {
        List<Integer> rotatedList = new ArrayList<>();

        // Step 1: Add elements from rotation index to the end
        for (int i = indexOfRotation; i < list.size(); i++) {
            rotatedList.add(list.get(i));
        }

        // Step 2: Add elements from the beginning to the rotation index
        for (int i = 0; i < indexOfRotation; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int indexOfRotation = 2;  // Rotate from index 2

        // Handle invalid index cases
        if (indexOfRotation < 0 || indexOfRotation >= list.size()) {
            System.out.println("Provide a valid index for rotation");
            return;
        }

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotateList(list, indexOfRotation));
    }
}
