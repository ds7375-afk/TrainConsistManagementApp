import java.util.HashMap;
import java.util.Map;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 6: Map Bogie to Capacity (HashMap)
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Scenario: Mapping Bogies to Operational Capacity\n");

        // 1. Initialize a HashMap
        // Key: Bogie Name (String) | Value: Capacity (Integer)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Use put() to create Key-Value associations
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);

        // 3. Demonstrate Fast Lookup
        // We can instantly find the capacity of a specific bogie type
        String query = "Sleeper";
        System.out.println("Capacity Lookup for '" + query + "': " + bogieCapacityMap.get(query) + " seats.");

        // 4. Iterate over the Map using entrySet()
        // This allows us to see both the Key and the Value in one loop
        System.out.println("\nFull Bogie Capacity Directory:");
        System.out.println("------------------------------------");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // 5. Summary
        System.out.println("------------------------------------");
        System.out.println("Total Bogie Types Registered: " + bogieCapacityMap.size());
    }
}