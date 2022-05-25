package by.epam.taskThree;



import by.epam.taskThree.entity.CustomArray;
import by.epam.taskThree.exeption.CustomArrayExp;
import by.epam.taskThree.reader.ReadFile;
import by.epam.taskThree.service.ConvertService;
import by.epam.taskThree.service.CustomArrayService;
import by.epam.taskThree.validator.NumberValidator;

import java.io.FileNotFoundException;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException, CustomArrayExp {

        ReadFile readFile = new ReadFile();
        List<Double> list = readFile.readTxtFile("src/main/resources/data.txt");
//        System.out.println(list.toString());
        ConvertService convertService = new ConvertService();
        CustomArrayService customArrayService = new CustomArrayService();
        System.out.println(customArrayService.findSum(convertService.arrayListToArray(list)));
//        System.out.println(list.toString());

//        customArrayService.findSum(list)

//        CustomArrayService customArrayService = new CustomArrayService();
//        customArrayService.separatePositiveAndNegative(customArray.getMassive());
//        System.out.println(customArray);

        double [] doubles = {3.2,5.0,3.6,88,0};
        NumberValidator numberValidator = new NumberValidator();
//        System.out.println(numberValidator.checkNegativeAndPositiveNumber("26.6 m²"));


//        System.out.println("CHECK FIND SUM==>"+customArrayService.findSum(doubles));

    }
}
