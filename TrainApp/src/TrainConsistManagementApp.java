import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * =========================================================================
 * Use Case 10: Count Total Seats in Train (reduce)
 * -------------------------------------------------------------------------
 * Description:
 * This class aggregates seating capacity of all bogies into a single total
 * using Stream reduce().
 */
public class UseCase10TrainConsistMgmnt {

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
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("======================================================\n");

        // 1. Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // 2. Display the bogies currently in the train
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 3. ---- AGGREGATE USING REDUCE ----
        // map() extracts the capacity field
        // reduce() sums them up starting from 0
        int totalSeatingCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 4. Display the aggregated result
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeatingCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}