package edu.epam.number_array.action;

public class NumberArrayFindAction {

    public double findMaxNumber(double[] numberArray) {
        double maxNumber = 0;

        for (double currentNumber : numberArray) {
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }

    public double findMinNumber(double[] numberArray) {
        double minNumber = findMaxNumber(numberArray);

        for (double currentNumber : numberArray) {
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        return minNumber;
    }

    public double[] findNumberBiggerAverage(double[] numberArray) {
        int average = 0;
        for (double current : numberArray) {
            average += current;
        }
        average /= numberArray.length;
        int count = 0;
        for (double current : numberArray) {
            if (current > average) {
                count++;
            }
        }
        double[] massiveBiggerNumber = new double[count];
        int loop = 0;
        for (double current : numberArray) {
            if (current > average) {
                massiveBiggerNumber[loop] = current;
                loop++;
            }
        }
        return massiveBiggerNumber;
    }

    public double[] findNumberSmallerAverage(double[] numberArray) {
        int average = 0;
        for (double current : numberArray) {
            average += current;
        }
        average /= numberArray.length;
        int count = 0;
        for (double current : numberArray) {
            if (current < average) {
                count++;
            }
        }
        double[] massiveSmallerNumber = new double[count];
        int loop = 0;
        for (double current : numberArray) {
            if (current < average) {
                massiveSmallerNumber[loop] = current;
                loop++;
            }
        }
        return massiveSmallerNumber;
    }
}
