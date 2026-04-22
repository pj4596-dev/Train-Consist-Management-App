package com.train.app;

import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===================================\n");

        // Create HashSet (stores unique values only)
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display final unique bogies
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        System.out.println("\nDuplicates are automatically removed!");
        System.out.println("\nUC3 operations completed successfully...");
    }
}