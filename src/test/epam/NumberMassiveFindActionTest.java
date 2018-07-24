package test.epam;

import edu.epam.number_array.action.NumberArrayFindAction;
import edu.epam.number_array.factory.FactoryArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberMassiveFindActionTest {
    private FactoryArray numberMassive = new FactoryArray();
    private NumberArrayFindAction massiveFindAction = new NumberArrayFindAction();

    @Test
    public void findMaxNumberTestPositive() {
        String[] testingString = {"9", "3"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double actual = massiveFindAction.findMaxNumber(massive);
        double expected = 9;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMaxNumberTestNegative() {
        String[] testingString = {"9", "3"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double actual = massiveFindAction.findMaxNumber(massive);
        double expected = 3;
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void findMinNumberTestPositive() {
        String[] testingString = {"9", "3"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);
        double actual = massiveFindAction.findMinNumber(massive);
        double expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMinNumberTestNegative() {
        String[] testingString = {"9", "3"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double actual = massiveFindAction.findMinNumber(massive);
        double expected = 9;
        Assert.assertNotEquals(actual, expected);
    }


    @Test
    public void findNumberBiggerAverageTestPositive() {
        String[] testingString = {"9", "3", "5", "6"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double[] actual = massiveFindAction.findNumberBiggerAverage(massive);
        double[] expected = {9, 6};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNumberBiggerAverageTestNegative() {
        String[] testingString = {"9", "3", "5", "6"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double[] actual = massiveFindAction.findNumberBiggerAverage(massive);
        double[] expected = {9, 3, 5};
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void findNumberSmallerAverageTestPositive() {
        String[] testingString = {"9", "3", "5", "6"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);

        double[] actual = massiveFindAction.findNumberSmallerAverage(massive);
        double[] expected = {3};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNumberSmallerAverageTestNegative() {
        String[] testingString = {"9", "3", "5", "6"};
        double[] massive = numberMassive.factoryDoubleArray(testingString);
        double[] actual = massiveFindAction.findNumberSmallerAverage(massive);
        double[] expected = {9, 3, 5};
        Assert.assertNotEquals(actual, expected);
    }
}