class RomanNumberConverter {

    String toRoman(int number) {

        if (number >= 10)
            return "X" + toRoman(number - 10);

        if (number >= 9)
            return toRoman(1) + "X";

        if (number >= 5)
            return "V" + toRoman(number - 5);

        if (number >= 4)
            return toRoman(1) + "V";

        if (number >= 1)
            return "I" + toRoman(number - 1);

        return "";
    }
}
