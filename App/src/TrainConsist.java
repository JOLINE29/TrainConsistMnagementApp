import java.util.LinkedList;

public class TrainConsist {
    public static void main(String[] args) {
        // 1. Create a LinkedList<String> for the consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add initial bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (index 2)
        // This demonstrates the efficiency of inserting in the middle of a LinkedList [cite: 1]
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + trainConsist);

        // 4. Remove the first and last bogie [cite: 1]
        // Using removeFirst() and removeLast() to detach head and tail [cite: 1]
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist [cite: 1]
        System.out.println("Final Ordered Train Consist: " + trainConsist);
    }
}