import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 * This class serves as the entry point for the Train Consist Management App.
 */
public class TrainConsist {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize the train consist using a dynamic ArrayList
        // We use the List interface for abstraction
        List<String> bogies = new ArrayList<>();

        // 3. Display the initial state of the train
        // Using .size() to show the count of bogies in the collection [cite: 1]
        System.out.println("Train consist initialized.");
        System.out.println("Initial Bogie Count: " + bogies.size());

        // 4. Program continues [cite: 1]
        System.out.println("Ready for further operations.");
    }
}