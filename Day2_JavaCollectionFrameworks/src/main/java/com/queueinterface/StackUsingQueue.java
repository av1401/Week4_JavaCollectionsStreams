package com.queueinterface;
import java.util.*;

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation (O(1))
    public void push(int x) {
        q1.add(x);
    }

    // Pop operation (O(n))
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move elements to q2 except last one
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element is the "top" element to pop
        int topElement = q1.poll();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Top operation (O(n))
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move elements to q2 except last one
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get last element
        int topElement = q1.peek();
        q2.add(q1.poll()); // Move it to q2

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped: " + stack.pop());      // Output: 3

    }
}

