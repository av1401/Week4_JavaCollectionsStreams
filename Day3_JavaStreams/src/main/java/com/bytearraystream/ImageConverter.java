package com.bytearraystream;

import java.io.*;

public class ImageConverter {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\bytearraystream\\Inputimg.webp";
        String outputFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\bytearraystream\\output.jpg.bmp";

        byte[] imageData = readImage(inputFile);
        if (imageData != null) {
            writeImage(imageData, outputFile);
        }
    }

    private static byte[] readImage(String path) {
        try (FileInputStream fis = new FileInputStream(path);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            bos.writeBytes(fis.readAllBytes());
            return bos.toByteArray();
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return null;
        }
    }

    private static void writeImage(byte[] data, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data);
            System.out.println("Image converted successfully!");
        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
        }
    }
}