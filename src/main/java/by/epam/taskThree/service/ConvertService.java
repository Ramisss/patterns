package by.epam.taskThree.service;

import java.util.List;

public class ConvertService {
    public double[] arrayListToArray(List<Double> integerList) {
        return integerList.stream().mapToDouble(i -> i).toArray();
    }
}
