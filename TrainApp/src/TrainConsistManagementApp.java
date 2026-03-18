import java.util.LinkedList;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 4: Maintain Ordered Bogie IDs (LinkedList)
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Scenario: Modeling Physical Train Sequence\n");

        // 1. Initialize a LinkedList to represent the train chain
        // LinkedList is ideal for sequential 'link-based' data like a train.
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add Bogies to the train (Order matters!)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Formation: " + trainConsist);

        // 3. Middle Insertion: Adding a Pantry Car at position 2 (index 2)
        // In a LinkedList, this is efficient as it just adjusts node pointers.
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + trainConsist);

        // 4. Removing the Head and Tail (First and Last bogies)
        // Models detaching the Engine or Guard coach for maintenance.
        String detachedHead = trainConsist.removeFirst();
        String detachedTail = trainConsist.removeLast();

        System.out.println("\nAction: Detached " + detachedHead + " (Front) and " + detachedTail + " (Rear).");

        // 5. Final Display
        System.out.println("\nFinal Ordered Consist: " + trainConsist);
        System.out.println("Remaining bogies: " + trainConsist.size());
    }
}
