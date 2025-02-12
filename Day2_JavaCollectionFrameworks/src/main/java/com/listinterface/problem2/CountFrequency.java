package com.listinterface.problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountFrequency {

    //method which will return the frequency of each element in the list
    public static HashMap<String, Integer> countFrequency(List<String> list){
        // Create a HashMap to store the frequency of each element in the list.
        HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
        for(String string : list){
            //if the map do not contain that item, add it to the frequency
            if(frequencyMap.containsKey(string)){
                frequencyMap.put(string, frequencyMap.get(string) + 1); //increase the frequency
            }
            else{
                frequencyMap.put(string, 1);
            }
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        //create a list
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("banana");
        list.add("apple");
        System.out.println("Original List: " + list);

        // call the frequency method
        System.out.println("Frequncy of each element : " + countFrequency(list));
    }
}
