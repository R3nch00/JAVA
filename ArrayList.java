package com.company;
import java.util.ArrayList; // Import ArrayList class
import java.util.Collections; // Package for Sorting an Array
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda"); // Add items on array
        System.out.println(cars);
        System.out.println(cars.get(1)); // Access an item
        cars.set(3,"Bugatti"); // Change an item
        System.out.println(cars); 
        cars.remove(0); //Erase the whole array
        System.out.println(cars);
	System.out.println(cars.size()); // Size of the array
	Collections.sort(cars); // Sorting accordingly Alphabet Sequence
        System.out.println(cars);	
    }
