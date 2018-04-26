import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTest {

    private final RomanNumberConverter converter = new RomanNumberConverter();

    @Test
    public void evaluates_number_0() {
        assertEquals("", converter.toRoman(0));
    }

    @Test
    public void evaluates_number_1() {
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void evaluates_number_2() {
        assertEquals("II", converter.toRoman(2));
    }

    @Test
    public void evaluates_number_3() {
        assertEquals("III", converter.toRoman(3));
    }

    @Test
    public void evaluates_number_4() {
        assertEquals("IV", converter.toRoman(4));
    }

    @Test
    public void evaluates_number_5() {
        assertEquals("V", converter.toRoman(5));
    }

    @Test
    public void evaluates_number_6() {
        assertEquals("VI", converter.toRoman(6));
    }

    @Test
    public void evaluates_number_7() {
        assertEquals("VII", converter.toRoman(7));
    }

    @Test
    public void evaluates_number_8() {
        assertEquals("VIII", converter.toRoman(8));
    }

    @Test
    public void evaluates_number_9() {
        assertEquals("IX", converter.toRoman(9));
    }

    @Test
    public void evaluates_number_10() {
        assertEquals("X", converter.toRoman(10));
    }

    @Test
    public void evaluates_number_40() {
        assertEquals("XL", converter.toRoman(40));
    }

    @Test
    public void evaluates_number_50() {
        assertEquals("L", converter.toRoman(50));
    }

    @Test
    public void evaluates_number_90() {
        assertEquals("XC", converter.toRoman(90));
    }

    @Test
    public void evaluates_number_100() {
        assertEquals("C", converter.toRoman(100));
    }

    @Test
    public void evaluates_number_400() {
        assertEquals("CD", converter.toRoman(400));
    }

    @Test
    public void evaluates_number_500() {
        assertEquals("D", converter.toRoman(500));
    }

    @Test
    public void evaluates_number_794() {
        assertEquals("DCCXCIV", converter.toRoman(794));
    }

    @Test
    public void evaluates_number_982() {
        assertEquals("CMLXXXII", converter.toRoman(982));
    }

    @Test
    public void evaluates_number_900() {
        assertEquals("CM", converter.toRoman(900));
    }

    @Test
    public void evaluates_number_1000() {
        assertEquals("M", converter.toRoman(1000));
    }

    @Test
    public void evaluates_number_1986() {
        assertEquals("MCMLXXXVI", converter.toRoman(1986));
    }

    @Test
    public void evaluates_number_1999() {
        assertEquals("MCMXCIX", converter.toRoman(1999));
    }

    @Test
    public void evaluates_number_314() {
        assertEquals("CCCXIV", converter.toRoman(314));
    }

    @Test
    public void evaluates_number_I() {
        assertEquals(1, converter.toDigit("I"));
    }

    @Test
    public void evaluates_number_II() {
        assertEquals(2, converter.toDigit("II"));
    }


    @Test
    public void evaluates_number_III() {
        assertEquals(3, converter.toDigit("III"));
    }

    @Test
    public void evaluates_number_IV() {
        assertEquals(4, converter.toDigit("IV"));
    }

    @Test
    public void evaluates_number_V() {
        assertEquals(5, converter.toDigit("V"));
    }

    @Test
    public void evaluates_number_DCCXCIV() {
        assertEquals(794, converter.toDigit("DCCXCIV"));
    }

    @Test
    public void evaluates_number_CMLXXXII() {
        assertEquals(982, converter.toDigit("CMLXXXII"));
    }

    @Test
    public void evaluates_number_MCMLXXXVI() {
        assertEquals(1986, converter.toDigit("MCMLXXXVI"));
    }


}