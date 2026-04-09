import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;


public class BogieFilterTest {

    // Helper method
    private List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC", 65),
                new Bogie("First", 50)
        );

        List<Bogie> result = filterBogies(list, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("AC", 70)
        );

        List<Bogie> result = filterBogies(list, 70);

        assertEquals(0, result.size()); // equal should NOT be included
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First", 40),
                new Bogie("AC", 50)
        );

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC", 75),
                new Bogie("First", 30)
        );

        List<Bogie> result = filterBogies(list, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First", 20),
                new Bogie("AC", 30)
        );

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC", 70)
        );

        List<Bogie> result = filterBogies(list, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 80));
        list.add(new Bogie("AC", 50));

        int originalSize = list.size();

        filterBogies(list, 60);

        assertEquals(originalSize, list.size()); // original list unchanged
    }
}