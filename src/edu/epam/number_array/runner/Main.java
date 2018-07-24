package edu.epam.number_array.runner;

import edu.epam.number_array.action.NumberArrayFindAction;
import edu.epam.number_array.factory.FactoryArray;
import edu.epam.number_array.filter.StringFilter;
import edu.epam.number_array.reader.ReaderFromConsole;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static private Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        ReaderFromConsole reader = new ReaderFromConsole();
        String[] consoleString = reader.readStringFromConsole(System.in);

        StringFilter stringFilter = new StringFilter();
        String[] validDoubleArray = stringFilter.filterDouble(consoleString);

        FactoryArray numberMassive = new FactoryArray();
        double[] doubleArray = numberMassive.factoryDoubleArray(validDoubleArray);

        NumberArrayFindAction massiveAction = new NumberArrayFindAction();
        logger.log(Level.INFO, massiveAction.findMaxNumber(doubleArray));

    }
}
