import java.util.Map;

abstract class WorkWithRomanNumber {

    private static final Map<String, Integer> ROMAN_NUMBERS = Map.of(
            "I", 1,
            "II", 2,
            "III", 3,
            "IV", 4,
            "V", 5,
            "VI", 6,
            "VII", 7,
            "VIII", 8,
            "IX", 9,
            "X", 10);

    public static Boolean isRomanNumbers(String numb1, String numb2) {

        if (ROMAN_NUMBERS.containsKey(numb1)) {
            return ROMAN_NUMBERS.containsKey(numb2);
        }

        return Boolean.FALSE;
    }

    public static String calcRomanNumber(String[] charactersString) {
        int number1 = ROMAN_NUMBERS.get(charactersString[0]);
        int number2 = ROMAN_NUMBERS.get(charactersString[2]);
        int result = Operation.calc(charactersString[1], number1, number2);

        if (result == Operation.ERROR) {
            return "Что - то пошло не так =(...";
        }
        if (result < 1) {
           throw new ArithmeticException("Результат меньше единицы, в римской системе нет таких цифр...");
        }
        return parseIntegerInString(result);

    }

    private static String parseIntegerInString(int number) {

        String[] keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder ret = new StringBuilder();
        int ind = 0;

        while (ind < keys.length) {
            while (number >= values[ind]) {
                int d = number / values[ind];
                number = number % values[ind];
                ret.append(keys[ind].repeat(d));
            }
            ind++;
        }

        return ret.toString();
    }

}
