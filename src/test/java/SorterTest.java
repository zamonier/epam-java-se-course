import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SorterTest {

    private Sorter s;

    String[] sortedZoo = {
            "hh",
            "elephant",
            "dog",
            "cat",
            "bird",
            "apple"
    };

    @Test
    public void test() {

        String[] zoo = {
                "hh",
                "apple",
                "bird",
                "cat",
                "dog",
                "elephant"
        };

        String[] result = s.sortDesc(zoo);

        assertArrayEquals(sortedZoo, result);
    }


    @Before
    public void init() {
        s = new Sorter();
    }


}