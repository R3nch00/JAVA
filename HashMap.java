package com.company; 
import java.util.HashMap; // Array HashMap class
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); 
        // HashMap<String, String> capitalCities = new HashMap<String, String>(); general form of HashMap which store String & u can change variable type as ur wish  
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC"); // Add items
        System.out.println(capitalCities);
	System.out.println(capitalCities.get("England")); // Access an item
	capitalCities.remove("England"); // Remove an item
    	System.out.println(capitalCities); 
	capitalCities.clear(); // Erase whole items 
        System.out.println(capitalCities);
	System.out.println(capitalCities.size()); // Size
    }
}
