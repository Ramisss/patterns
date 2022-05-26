package by.epam.taskThree.wareHouse;

import by.epam.taskThree.entity.CustomArray;

import java.util.HashMap;

public class Warehouse {
    public static final Warehouse WAREHOUSE = new Warehouse();
    public HashMap<Integer, CustomArray> customArrayHashMap = new HashMap<>();


    public static Warehouse getInstance(){
        return WAREHOUSE;
    }

    public CustomArray addCustomArray(CustomArray customArray, int id){
        return customArrayHashMap.put(id,customArray);
    }

    public CustomArray getCustomArray(int id) {
        return customArrayHashMap.get(id);
    }



}
