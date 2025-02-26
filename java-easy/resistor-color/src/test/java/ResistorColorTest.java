import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @Before
    public void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "black";
        int expected = 0;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Test
    public void testWhiteColorCode() {
        String input = "white";
        int expected = 9;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Test
    public void testOrangeColorCode() {
        String input = "orange";
        int expected = 3;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Test
    public void testColors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        assertArrayEquals(expected, resistorColor.colors());
    }
    
}
