package baseball;

public class Validate {
    public static void validateInputNumber(String inputNumbers) throws IllegalArgumentException {

        if (!isThreeDigits(inputNumbers) || !isNumeric(inputNumbers)) {
            throw new IllegalArgumentException();
        }

    }

    private static boolean isThreeDigits(String inputNumbers) {
        return inputNumbers.length() == 3;
    }

    private static boolean isNumeric(String inputNumbers) {
        try {
            Integer.parseInt(inputNumbers);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
