import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

class RomanNumberConverter {

    Map link = new HashMap<Integer, String>() {{
        put(0, "");
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
    }};

    String toRoman(Integer number) {

        if (link.containsKey(number))
            return String.valueOf(link.get(number));

        if (number >= 10)
            return "X" + toRoman(number - 10);

        if (number >= 5)
            return "V" + toRoman(number - 5);

        if (number >= 1)
            return "I" + toRoman(number - 1);

        return "";
    }
}
