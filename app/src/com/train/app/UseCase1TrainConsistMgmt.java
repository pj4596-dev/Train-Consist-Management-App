package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================\n");

        // Create dynamic list
        List<String> trainConsist = new ArrayList<>();

        // Initialize
        System.out.println("Train initialized successfully...");

        // Display count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display consist
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}