import java.util.HashSet;
import java.util.Set;

public class TrainConsist {
    public static void main(String[] args) {
        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs to the system
        System.out.println("Adding bogies to the train...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Intentionally adding a duplicate value to test uniqueness
        System.out.println("Attempting to add duplicate ID: BG101");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Duplicate ID BG101 was ignored by the system.");
        }

        // Display the final set of unique IDs
        System.out.println("\nFinal Train Consist (Unique Bogie IDs):");
        for (String id : bogieIds) {
            System.out.println("Bogie ID: " + id);
        }

        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}