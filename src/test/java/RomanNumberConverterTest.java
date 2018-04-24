import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTest {
    private final RomanNumberConverter converter = new RomanNumberConverter();

    @Test
    public void evaluates_number_zero() {
        assertEquals("", converter.toRoman(0));
    }

    @Test
    public void evaluates_number_one() {
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void evaluates_number_two() {
        assertEquals("II", converter.toRoman(2));
    }

    @Test
    public void evaluates_number_three() {
        assertEquals("III", converter.toRoman(3));
    }

    @Test
    public void evaluates_number_four() {
        assertEquals("IV", converter.toRoman(4));
    }

    @Test
    public void evaluates_number_five() {
        assertEquals("V", converter.toRoman(5));
    }

    @Test
    public void evaluates_number_six() {
        assertEquals("VI", converter.toRoman(6));
    }
}