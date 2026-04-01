import java.util.ArrayList;

public class TrainConsist {
    public static void main(String[] args) {
        // Create an ArrayList to store passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // 1. Add passenger bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 2. Display the initial list of bogies
        System.out.println("Initial Train Consist: " + passengerBogies);

        // 3. Remove a specific bogie (e.g., AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // 4. Check if a specific bogie exists (e.g., Sleeper)
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train have a Sleeper bogie? " + hasSleeper);

        // 5. Print the final state of the train consist
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}