import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsist {
    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        // This ensures uniqueness and preserves insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 1. Attach bogies to the engine
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        // 2. Attempt to attach a duplicate bogie (e.g., Sleeper again) [cite: 1]
        // LinkedHashSet will automatically ignore this duplicate [cite: 1]
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("\nDuplicate bogie 'Sleeper' detected! Attachment ignored.");
        }

        // 3. Display the final formation order [cite: 1]
        // The order remains: Engine -> Sleeper -> Cargo -> Guard [cite: 1]
        System.out.println("\nFinal Train Formation (Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.println("- " + bogie);
        }
    }
}