package edu.epam.number_array.action;

public class NumberArraySortAction {
    public double[] sortBubbleMassiveIncrease(double[] currentMassive) {
        for (int i = 0; i < currentMassive.length; i++) {
            for (int j = i + 1; j < currentMassive.length; j++) {
                if (currentMassive[j] < currentMassive[i]) {
                    double buf = currentMassive[i];
                    currentMassive[i] = currentMassive[j];
                    currentMassive[j] = buf;
                }
            }
        }
        return currentMassive;
    }

    public double[] sortBubbleMassiveDecrease(double[] currentMassive) {
        for (int i = 0; i < currentMassive.length; i++) {
            for (int j = i + 1; j < currentMassive.length; j++) {
                if (currentMassive[j] > currentMassive[i]) {
                    double buf = currentMassive[i];
                    currentMassive[i] = currentMassive[j];
                    currentMassive[j] = buf;
                }
            }
        }
        return currentMassive;
    }

    public double[] sortChoiceMassive(double[] currentMassive) {
        for (int i = 0; i < currentMassive.length; i++) {
            double minValue = currentMassive[i];
            int minIndex = i;
            for (int j = i + 1; j < currentMassive.length; j++) {
                if (currentMassive[j] < minValue) {
                    minValue = currentMassive[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                double buf = currentMassive[i];
                currentMassive[i] = currentMassive[minIndex];
                currentMassive[minIndex] = buf;
            }
        }
        return currentMassive;
    }

    public double[] quickSortMassive(double[] currentMassive) {
        quickSort(currentMassive, 0, currentMassive.length - 1);
        return currentMassive;
    }

    private void quickSort(double[] currentMassive, int left, int right) {
        if (currentMassive.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        double middle = currentMassive[left + (left + right) / 2];
        while (i <= j) {
            while (currentMassive[i] < middle) {
                i++;
            }
            while (currentMassive[j] > middle) {
                j--;
            }
            if (i <= j) {
                double buf = currentMassive[i];
                currentMassive[i] = currentMassive[j];
                currentMassive[j] = buf;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(currentMassive, left, j);
        }
        if (right > i) {
            quickSort(currentMassive, i, right);
        }
    }
}
