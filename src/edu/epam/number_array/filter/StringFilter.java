package edu.epam.number_array.filter;

public class StringFilter {
    private static final String REGEX_DOUBLE_NUMBER = "\\d+[.]?[\\d+]?";

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
}
