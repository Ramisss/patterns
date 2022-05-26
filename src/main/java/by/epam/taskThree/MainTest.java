package by.epam.taskThree;



import by.epam.taskThree.entity.CustomArray;
import by.epam.taskThree.exeption.CustomArrayExp;
import by.epam.taskThree.validator.NumberValidator;
import by.epam.taskThree.wareHouse.Warehouse;

import java.io.FileNotFoundException;

import static by.epam.taskThree.wareHouse.Warehouse.WAREHOUSE;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException, CustomArrayExp {
        CustomArray warehouse =WAREHOUSE.getCustomArray(1);


//        ReadFile readFile = new ReadFile();
//        List<Double> list = readFile.readTxtFile("src/main/resources/data2.txt");
////        System.out.println(list.toString());
//        ConvertService convertService = new ConvertService();
//        CustomArrayService customArrayService = new CustomArrayService();
//        System.out.println(customArrayService.findSum(convertService.arrayListToArray(list)));
////        System.out.println(list.toString());
//
////        customArrayService.findSum(list)
//
////        CustomArrayService customArrayService = new CustomArrayService();
////        customArrayService.separatePositiveAndNegative(customArray.getMassive());
////        System.out.println(customArray);

        double [] doubles = {3.2,5.0,3.6,88,0};
        NumberValidator numberValidator = new NumberValidator();
        System.out.println(numberValidator.checkNegativeAndPositiveNumber("26.6 m²"));


//        System.out.println("CHECK FIND SUM==>"+customArrayService.findSum(doubles));

    }
}
