import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Scenario: Ordered Unique Train Formation\n");

        // 1. Initialize a LinkedHashSet
        // This ensures every bogie is unique (Set) AND maintains order (Linked)
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach Bogies in a specific sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        // 3. Attempt to attach a duplicate bogie
        // In a real yard, a "Sleeper" coach already on the tracks cannot be added again.
        System.out.println("\nAction: Attempting to re-attach 'Sleeper'...");
        boolean addedAgain = trainFormation.add("Sleeper");

        if (!addedAgain) {
            System.out.println("Result: Duplicate 'Sleeper' rejected. System integrity maintained.");
        }

        // 4. Display the Final Formation
        // Note: Unlike HashSet, the order will strictly be: Engine -> Sleeper -> Cargo -> Guard
        System.out.println("\nFinal Train Consist (Ordered & Unique):");
        System.out.println(trainFormation);

        // 5. Summary Check
        System.out.println("Total unique bogies in sequence: " + trainFormation.size());
    }
}