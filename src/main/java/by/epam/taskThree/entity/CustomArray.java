package by.epam.taskThree.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] massive;
    private String name;

    public CustomArray(int[] customArray, String name) {
        this.massive = customArray;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (!Arrays.equals(massive, that.massive)) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(massive);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
