import java.util.ArrayList;
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

    Map<String, Integer> numbersInverted = new LinkedHashMap<String, Integer>(){{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
        put("", 0);
    }};



    public String toRoman(Integer number) {
        if (numbers.containsKey(number))
            return String.valueOf(numbers.get(number));

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            if (number < entry.getKey()) continue;
            return entry.getValue() + toRoman(number - entry.getKey());
        }

        return null;
    }

    public int toDigit(String roman) {

        ArrayList<String> list = listOfRomanValues(roman);

        int sumOfRomanValues = sumAllRomanValues(list, 0, 0);

        return sumOfRomanValues;
    }

    private ArrayList<String> listOfRomanValues (String roman) {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < roman.length(); i++) {

            if (i + 1 < roman.length()) {
                int currentRomanTokenValue = numbersInverted.get(Character.toString(roman.charAt(i)));
                int nextRomanTokenValue = numbersInverted.get(Character.toString(roman.charAt(i + 1)));
                if (currentRomanTokenValue < nextRomanTokenValue) {
                    list.add(roman.charAt(i) + "" + roman.charAt(i + 1));
                    i++;
                } else {
                    list.add(String.valueOf(roman.charAt(i)));
                }

            } else {
                list.add(String.valueOf(roman.charAt(i)));
            }
        }

        return list;

    }

    private int sumAllRomanValues(ArrayList<String> tokens, int index, int sum) {

        if(tokens.size() == index)
            return sum;

        int currentSum = 0;

        String currentToken = tokens.get(index);

        currentSum += numbersInverted.get(currentToken);

        return sumAllRomanValues(tokens, index+1, sum + currentSum);
    }



}
