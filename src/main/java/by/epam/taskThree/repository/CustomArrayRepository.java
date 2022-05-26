package by.epam.taskThree.repository;

import by.epam.taskThree.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayRepository {
    public static final CustomArrayRepository CUSTOM_ARRAY_REPOSITORY = new CustomArrayRepository();
    private List<CustomArray> customArrayList = new ArrayList<>();

    public static CustomArrayRepository getInstance() {
        return CUSTOM_ARRAY_REPOSITORY;
    }

    public void remove (int id) {
//        boolean b = customArrayList.removeIf(customArray1 -> customArray1.getId() = id);
    }
}
