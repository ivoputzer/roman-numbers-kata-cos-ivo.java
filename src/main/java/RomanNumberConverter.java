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

    Map<String, Integer> priority = new LinkedHashMap<String, Integer>(){{
        put("M", 1);
        put("D", 2);
        put("C", 3);
        put("L", 4);
        put("X", 5);
        put("V", 6);
        put("I", 7);
        put("", 8);
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



        ArrayList<String> container = new ArrayList<String>();

        for(int i = 0; i < roman.length(); i++) {
            if(i+1 < roman.length()) {
                int priorityOfCurrent = priority.get(Character.toString(roman.charAt(i)));
                int priorityOfNext = priority.get(Character.toString(roman.charAt(i + 1)));
                if(priorityOfCurrent > priorityOfNext) {
                    container.add(roman.charAt(i) + "" + roman.charAt(i + 1));
                    i++;
                }
                else {
                    container.add("" + roman.charAt(i));
                }
            } else {
                container.add("" + roman.charAt(i));
            }
        }


        return toDigitAux(container, 0, 0);
    }

    private int toDigitAux(ArrayList<String> tokens, int index, int sum) {

        if(tokens.size() == index)
            return sum;


        int currentSum = 0;

        String currentToken = tokens.get(index);

        currentSum += numbersInverted.get(currentToken);

        return toDigitAux(tokens, index+1, sum + currentSum);
    }



}
