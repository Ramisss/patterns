package by.epam.taskThree.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] massive;
    private int  id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (id != that.id) return false;
        return Arrays.equals(massive, that.massive);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(massive);
        result = 31 * result + id;
        return result;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomArray(int[] massive, int id) {
        this.massive = massive;
        this.id = id;
    }
}
