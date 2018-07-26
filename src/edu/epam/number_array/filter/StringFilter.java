package edu.epam.number_array.filter;

public class StringFilter {
    private static final String REGEX_DOUBLE_NUMBER = "\\d+[.]?[\\d+]?";
    private static final int MAX_LENGTH = 100_000;

    public String[] filterDouble(String[] numbers) {
        int counter = 0;
        for (String numberString : numbers) {
            if (numberString.matches(REGEX_DOUBLE_NUMBER)) {
                counter++;
            }
        }
        String[] validString = new String[counter];
        int index = 0;
        for (String numberString : numbers) {
            if (numberString.matches(REGEX_DOUBLE_NUMBER)) {
                validString[index] = numberString;
                index++;
            }
        }
        return validString;
    }

    public String[] filterLength(String[] numbers) {
        String[] validString;
        if (numbers.length < MAX_LENGTH) {
            validString = numbers;
        } else {
            validString = new String[MAX_LENGTH];
            System.arraycopy(numbers,0,validString,0,MAX_LENGTH);
        }
        return validString;
    }
}
