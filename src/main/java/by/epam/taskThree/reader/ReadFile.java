package by.epam.taskThree.reader;



import by.epam.taskThree.validator.NumberValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    static Logger logger = LogManager.getLogger();


    /*return
     ArrayList after reading TXT file
    */
    public List<Double> readTxtFile(String path) throws FileNotFoundException {

//        File file = new File(path);
//        List<Double> integerList;
//        try (Scanner scanner = new Scanner(file)) {
//
//            String srt;
//            NumberValidator validator = new NumberValidator();
//            integerList = new ArrayList<>();
//
//            while (scanner.hasNextLine()) {
//                srt = scanner.next();
//                if (validator.checkNegativeAndPositiveNumber(srt)) {
//                    double parseFromString = Double.parseDouble(srt);
//                    integerList.add(parseFromString);
//                } else {
//                    logger.log(Level.ERROR, "NOT INTEGER");
//                }
//            }
//        }
//        logger.log(Level.INFO, integerList.toString());
//        return integerList;
//    }
        File file = new File(path);
        List<Double> integerList;
        try (Scanner scanner = new Scanner(file)) {

            String srt;
            NumberValidator validator = new NumberValidator();
            integerList = new ArrayList<>();

            while (scanner.hasNextLine()) {
                srt = scanner.next();
                if (validator.checkNegativeAndPositiveNumber(srt)) {
                    double v = validator.parceStringToDouble(srt);
//                    double parseFromString = Double.parseDouble(srt);
                    integerList.add(v);
                } else {
                    logger.log(Level.ERROR, "NOT INTEGER==> ");
                }
            }
        }
        logger.log(Level.INFO, integerList.toString());
        return integerList;
    }
}
