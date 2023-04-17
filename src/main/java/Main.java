import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите пример для вычисления в формате: 1 + 4 или II + IV");

        Scanner s = new Scanner(System.in);
        String enteredString = s.nextLine();

        System.out.println("Ответ: " + calc(enteredString));
    }

    public static String calc(String input) {

        String[] charactersString = input.split(" ");

        if (charactersString.length != 3) {
            throw new IllegalArgumentException("Введён не верный формат примера.");
        }

        String number1 = charactersString[0];
        String number2 = charactersString[2];

        boolean isRomanNumber = WorkWithRomanNumber.isRomanNumbers(number1, number2);

        if (isRomanNumber) {
            return WorkWithRomanNumber.calcRomanNumber(charactersString);
        }

        boolean isArabicNumber = WorkWithArabicNumber.isArabicNumbers(number1, number2);

        if (isArabicNumber) {
            return WorkWithArabicNumber.calcArabicNumber(charactersString);
        }

        return "Введён не верный формат примера.";
    }

}
