package edu.epam.number_array.reader;

import java.io.InputStream;
import java.util.Scanner;

public class ReaderFromConsole {
    private static final String REGEX_DELIMITER = "\\s+";


    public String[] readStringFromConsole(InputStream printStream) {
        Scanner scanner = new Scanner(printStream);
        String stringFromConsole = scanner.nextLine();
        String[] stringArray = stringFromConsole.split(REGEX_DELIMITER);
        return stringArray;
    }
}
