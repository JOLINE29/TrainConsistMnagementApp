import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsist {
    // 1. You can declare the list here (Class level)
    static List<Bogie> bogies = new ArrayList<>();

    public static void main(String[] args) {
        // 2. ACTION: You must call .add() inside a method (like main)
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 3. Sort logic
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // 4. Output
        System.out.println("Sorted Bogies:");
        bogies.forEach(System.out::println);
    }
}

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}