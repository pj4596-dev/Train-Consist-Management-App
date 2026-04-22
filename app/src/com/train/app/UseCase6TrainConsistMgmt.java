package com.train.app;

import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===================================\n");

        // Create HashMap (Key = Bogie, Value = Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // Add bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Display all bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}
