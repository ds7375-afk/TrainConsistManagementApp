import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * =========================================================================
 * Use Case 8: Filter Passenger Bogies Using Streams
 * -------------------------------------------------------------------------
 * Description:
 * This class filters passenger bogies based on seating capacity
 * using the Java Stream API, demonstrating functional programming.
 */
public class UseCase8TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        // UI Header
        System.out.println("======================================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("======================================================\n");

        // 1. Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 2. Display Unfiltered Data
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // 3. Apply Stream API: filter() and collect()
        // Condition: Seating capacity must be greater than 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 4. Display Filtered Result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            filteredBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}