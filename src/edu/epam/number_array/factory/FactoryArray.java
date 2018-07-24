package edu.epam.number_array.factory;

public class FactoryArray {

    public double[] factoryDoubleArray(String[] values) {
        double[] massive = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            massive[i] = Double.parseDouble(values[i]);
        }
        return massive;
    }
}
