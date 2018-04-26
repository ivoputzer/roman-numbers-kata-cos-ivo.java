import java.util.LinkedHashMap;
import java.util.Map;

class RomanNumberConverter {

    Map<Integer, String> numbers = new LinkedHashMap<Integer, String>(){{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
        put(0, "");
    }};

    String toRoman(Integer number) {
        if (numbers.containsKey(number))
            return String.valueOf(numbers.get(number));

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            if (number < entry.getKey()) continue;
            return entry.getValue() + toRoman(number - entry.getKey());
        }

        return null;
    }

    public int toDigit(String roman) {

        int totalOfI = 0;
        char oneInRoman = 'I';

        int toReturn = 0;


        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == oneInRoman) {
                totalOfI++;
            }
        }

        toReturn = totalOfI;

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            if (roman == entry.getValue()) {
                toReturn = entry.getKey();
            }
        }



        return toReturn;
    }

}
