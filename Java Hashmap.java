import java.util.HashMap;
public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("England")); // Access an item
    capitalCities.remove("England"); // Remove am item
    capitalCities.clear(); // Clear
    System.out.println(capitalCities.size()); // Size
    System.out.println(capitalCities); 
    /* for (String i : capitalCities.keySet()) { // Loop Through a Hashmap(Key)
      System.out.println(i);
    }
    */
    /* for (String i : capitalCities.values()) { // Loop Through a Hashmap(Value)
      System.out.println(i);
    }
    */
  }
}