import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =========================================================================
 * Use Case 12: Safety Compliance Check for Goods Bogies
 * -------------------------------------------------------------------------
 * Description:
 * This class enforces safety rules using the Stream allMatch() operation.
 * Rule: Cylindrical bogies MUST carry Petroleum to be considered safe.
 */
public class UseCase12TrainConsistMgmnt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return String.format("%-12s : %-10s", type, cargo);
        }
    }

    public static void main(String[] args) {
        // UI Header
        System.out.println("======================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("======================================================\n");

        // 1. Prepare a list of goods bogies (Mixed valid and potentially invalid)
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Displaying current data
        System.out.println("Current Goods Consist:");
        goodsConsist.forEach(b -> System.out.println("  " + b));

        // 2. Apply allMatch() to validate every bogie
        // Logic: For every bogie, IF it is Cylindrical, THEN cargo must be Petroleum.
        boolean isSafe = goodsConsist.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum")
        );

        // 3. Display Safety Result
        System.out.println("\n------------------------------------------------------");
        if (isSafe) {
            System.out.println("STATUS: SAFE ✅");
            System.out.println("Compliance: All cylindrical bogies contain Petroleum.");
        } else {
            System.out.println("STATUS: UNSAFE ❌");
            System.out.println("Violation: Found a cylindrical bogie with illegal cargo!");
        }
        System.out.println("------------------------------------------------------");

        System.out.println("\nUC12 safety check completed...");
    }
}