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

    @Test
    public void evaluates_number_seven() {
        assertEquals("VII", converter.toRoman(7));
    }

    @Test
    public void evaluates_number_eight() {
        assertEquals("VIII", converter.toRoman(8));
    }

    @Test
    public void evaluates_number_nine() {
        assertEquals("IX", converter.toRoman(9));
    }

    @Test
    public void evaluates_number_ten() {
        assertEquals("X", converter.toRoman(10));
    }

    @Test
    public void evaluates_number_eleven() {
        assertEquals("XI", converter.toRoman(11));
    }

    @Test
    public void evaluates_number_thirteen() {
        assertEquals("XIII", converter.toRoman(13));
    }

    @Test
    public void evaluates_number_fourteen() {
        assertEquals("XIV", converter.toRoman(14));
    }

    @Test
    public void evaluates_number_twenty() {
        assertEquals("XX", converter.toRoman(20));
    }

    @Test
    public void evaluates_number_thirtyeight() {
        assertEquals("XXXVIII", converter.toRoman(38));
    }

    @Test
    public void evaluates_number_thirtynine() {
        assertEquals("XXXIX", converter.toRoman(39));
    }
}