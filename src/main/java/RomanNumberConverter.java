class RomanNumberConverter {
    String toRoman(int number) {

        if (number == 6)
            return "V" + toRoman(1);

        if (number == 5)
            return "V";

        if (number == 4)
            return toRoman(1) + "V";

        if (number > 0)
            return "I" + toRoman(number-1);

        return "";
    }
}
