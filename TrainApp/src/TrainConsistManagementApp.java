import java.util.HashSet;
import java.util.Set;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 3: Track Unique Bogie IDs (Set – HashSet)
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Scenario: Enforcing Unique Bogie IDs\n");

        // 1. Initialize a HashSet to store unique Bogie IDs
        // We use the Set interface for abstraction.
        Set<String> uniqueBogieIds = new HashSet<>();

        // 2. Add Bogie IDs to the set
        uniqueBogieIds.add("BG101");
        uniqueBogieIds.add("BG102");
        uniqueBogieIds.add("BG103");

        // 3. Intentional Duplicate Addition
        // Attempting to add a duplicate ID to simulate a system error or double-entry
        System.out.println("Attempting to add duplicate ID: BG101...");
        boolean isAdded = uniqueBogieIds.add("BG101");

        // 4. Check if the duplicate was accepted
        if (!isAdded) {
            System.out.println("Result: Duplicate rejected by HashSet logic.");
        }

        // 5. Display the final set of Unique IDs
        System.out.println("\nRegistered Unique Bogie IDs:");
        System.out.println(uniqueBogieIds);

        // 6. Summary
        System.out.println("Total Unique Bogies: " + uniqueBogieIds.size());
    }
}
