package com.datastreams;

import java.io.*;

public class StoreAndRetrievePrimitive {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\datastreams\\StudentData.txt";

        // Writing student details
        writeStudentData(fileName);

        // Reading and displaying student details
        readStudentData(fileName);
    }

    private static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(007);          // Roll Number
            dos.writeUTF("Abhishek");      // Name
            dos.writeDouble(7.6);       // GPA

            dos.writeInt(138);
            dos.writeUTF("Sail");
            dos.writeDouble(9.2);

            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    private static void readStudentData(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
