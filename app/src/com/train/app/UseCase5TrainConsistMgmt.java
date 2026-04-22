package com.train.app;

import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===================================\n");

        // LinkedHashSet maintains order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Try adding duplicate
        formation.add("Sleeper"); // ignored

        // Display formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nDuplicates are automatically ignored!");
        System.out.println("\nUC5 operations completed successfully...");
    }
}
