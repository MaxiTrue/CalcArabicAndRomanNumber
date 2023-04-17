abstract class WorkWithArabicNumber {

    private static final int MAX_VALUE = 10;

    public static Boolean isArabicNumbers(String numb1, String numb2) {

        try {
            int value1 = Integer.parseInt(numb1);
            int value2 = Integer.parseInt(numb2);

            return value1 <= MAX_VALUE && value2 <= MAX_VALUE;
        } catch (NumberFormatException e) {
            return Boolean.FALSE;
        }
    }

    public static String calcArabicNumber(String[] charactersString) {
        int number1 = Integer.parseInt(charactersString[0]);
        int number2 = Integer.parseInt(charactersString[2]);
        int result = Operation.calc(charactersString[1], number1, number2);

        if (result == Operation.ERROR) {
            return "Что - то пошло не так =(...";
        }
        return parseIntegerInString(result);
    }

    private static String parseIntegerInString(int number) {
        return String.valueOf(number);
    }
}
