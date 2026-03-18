import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 2: Add Passenger Bogies to Train (ArrayList Operations)
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Create: Initialize the ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add: Attaching bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Read: Display the current consist
        System.out.println("Passenger bogies added: " + passengerBogies);
        System.out.println("Total bogie count: " + passengerBogies.size());

        // 4. Delete: Removing a bogie (e.g., for maintenance or route change)
        String removedBogie = "AC Chair";
        passengerBogies.remove(removedBogie);
        System.out.println("\nAction: " + removedBogie + " has been detached.");

        // 5. Search: Checking for existence using contains()
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Checking existence: Is 'Sleeper' attached? " + hasSleeper);

        // 6. Final State: Display final list
        System.out.println("\nFinal Train Consist: " + passengerBogies);
        System.out.println("Final bogie count: " + passengerBogies.size());
    }
}
