package by.epam.taskThree;



import by.epam.taskThree.entity.CustomArray;
import by.epam.taskThree.exeption.CustomArrayExp;
import by.epam.taskThree.reader.ReadFile;
import by.epam.taskThree.service.ConvertService;
import by.epam.taskThree.service.CustomArrayService;

import java.io.FileNotFoundException;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException, CustomArrayExp {

        ReadFile readFile = new ReadFile();
        List<Integer> list = readFile.readTxtFile("src/main/resources/data.txt");
        ConvertService convertService = new ConvertService();
        CustomArray customArray = new CustomArray(convertService.arrayListToArray(list), "CostomArrayFeild");
        CustomArrayService customArrayService = new CustomArrayService();
        customArrayService.separatePositiveAndNegative(customArray.getMassive());
        System.out.println(customArray);

    }
}
