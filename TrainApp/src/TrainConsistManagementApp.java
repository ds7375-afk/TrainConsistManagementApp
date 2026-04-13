import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =========================================================================
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 * -------------------------------------------------------------------------
 * Description:
 * This class ensures data integrity by validating Train IDs (TRN-1234)
 * and Cargo Codes (PET-AB) using Regular Expressions (Pattern & Matcher).
 */
public class UseCase11TrainConsistMgmnt {

    /**
     * Utility method to perform regex validation.
     * @param input The string to check.
     * @param regex The pattern to match against.
     * @return true if input matches regex exactly.
     */
    public static boolean validateInput(String input, String regex) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static void displayResult(String label, String value, boolean isValid) {
        String status = isValid ? "VALID ✅" : "INVALID ❌";
        System.out.println(String.format("%-25s [%-10s] : %s", label, value, status));
    }

    public static void main(String[] args) {
        // UI Header
        System.out.println("======================================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes (Regex) ");
        System.out.println("======================================================\n");

        // Regex Rules
        String trainIdRegex = "TRN-\\d{4}";       // Prefix 'TRN-' followed by exactly 4 digits
        String cargoCodeRegex = "PET-[A-Z]{2}";   // Prefix 'PET-' followed by exactly 2 uppercase letters

        // 1. Validating Train IDs
        System.out.println("--- Train ID Validation ---");
        displayResult("Correct Format", "TRN-1234", validateInput("TRN-1234", trainIdRegex));
        displayResult("Wrong Prefix", "TRAIN12", validateInput("TRAIN12", trainIdRegex));
        displayResult("Insufficient Digits", "TRN-123", validateInput("TRN-123", trainIdRegex));
        displayResult("Extra Characters", "TRN-12345", validateInput("TRN-12345", trainIdRegex));

        // 2. Validating Cargo Codes
        System.out.println("\n--- Cargo Code Validation ---");
        displayResult("Correct Format", "PET-AB", validateInput("PET-AB", cargoCodeRegex));
        displayResult("Lowercase Letters", "PET-ab", validateInput("PET-ab", cargoCodeRegex));
        displayResult("Numeric Suffix", "PET-12", validateInput("PET-12", cargoCodeRegex));
        displayResult("Empty Input", "", validateInput("", cargoCodeRegex));

        System.out.println("\nUC11 validation completed...");
    }
}