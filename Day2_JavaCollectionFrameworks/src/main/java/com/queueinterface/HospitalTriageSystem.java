package com.queueinterface;

import java.util.*;

class Patient {
    String name;
    int severity;

    // Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator (higher severity first)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity) // Descending order
        );

        // Adding patients to the queue
        triageQueue.add(new Patient("Honey", 3));
        triageQueue.add(new Patient("Bunny", 5));
        triageQueue.add(new Patient("Sunny", 2));

        // Processing patients based on severity
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            Patient patient = triageQueue.poll(); // Retrieve highest severity patient
            System.out.print(patient.name + " ");
        }
    }
}