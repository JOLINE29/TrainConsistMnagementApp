import java.util.HashMap;
import java.util.Map;

public class TrainConsist {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Use the put() method to map bogie names to their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Rectangular Goods", 100); // Representing load capacity
        bogieCapacityMap.put("Cylindrical Goods", 80);

        System.out.println("--- Train Bogie Capacity Details ---");

        // 3. Iterate through the map using entrySet() to display details
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // 4. Fast lookup example
        String searchBogie = "Sleeper";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nQuick Lookup: " + searchBogie + " has a capacity of " + bogieCapacityMap.get(searchBogie));
        }
    }
}