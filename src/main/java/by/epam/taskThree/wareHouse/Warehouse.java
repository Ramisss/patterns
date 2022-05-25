package by.epam.taskThree.wareHouse;

import by.epam.taskThree.entity.CustomArray;

import java.util.HashMap;

public class Warehouse {
    public static final Warehouse WAREHOUSE = new Warehouse();
    public HashMap<Integer, CustomArray> customArrayHashMap = new HashMap<>();


    public static Warehouse getInstance(){
        return WAREHOUSE;
    }


}
