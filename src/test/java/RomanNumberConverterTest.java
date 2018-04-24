import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTest {
    final RomanNumberConverter converter = new RomanNumberConverter();

    @Test
    public void evaluates_number_one() {
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void evaluates_number_two() {
        assertEquals("II", converter.toRoman(2));
    }
}