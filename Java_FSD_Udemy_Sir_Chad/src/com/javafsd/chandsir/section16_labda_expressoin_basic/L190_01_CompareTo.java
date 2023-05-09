package com.javafsd.chandsir.section16_labda_expressoin_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
    private String name;

    public Data(String name) {
        this.name = name;
    }

    // getter method to get the name of the Data object
    public String getName() {
        return name;
    }

    // Overridden toString method to print object details
    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }
}

public class L190_01_CompareTo {
    public static void main(String args[]) {
        // Create a list of Data objects
        List<Data> list = new ArrayList<>();
        list.add(new Data("Vishwjeet"));
        list.add(new Data("Abhi"));
        list.add(new Data("Shree"));
        list.add(new Data("Poorva"));
        list.add(new Data("Ed"));

        // Sort the list based on the name field using a comparator
        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Print the sorted list
        for (Data data : list) {
            System.out.println(data.getName());
        }
        
        // end of main method
    }
}
