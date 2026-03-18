import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================================
 * PROJECT: Train Consist Management App
 * USE CASE 1: Initialize Train and Display Consist Summary
 * =============================================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Print Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Dynamic Initialization
        // We use the List interface (abstraction) with an ArrayList implementation.
        // This list will hold "Bogies" (currently represented as Strings for UC1).
        List<String> trainConsist = new ArrayList<>();

        // 3. Display Initial Consist Summary
        // The size() method tells us how many bogies are currently attached.
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("------------------------------------");
        System.out.println("Status: Ready to add bogies.");
    }
}
