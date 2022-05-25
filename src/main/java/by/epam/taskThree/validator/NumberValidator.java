package by.epam.taskThree.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

    public boolean checkNegativeAndPositiveNumber(String number) {
        Pattern pattern = Pattern.compile("\\d+\\.?\\d+");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public double parceStringToDouble(String number) {
        Pattern pattern = Pattern.compile("\\d+\\.?\\d+");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            double v = matcher.groupCount();
            return v;
        } else return 0;


    }

    //         вопрос в matches
    public boolean checkNegativeNumber(String number) {
        if (number.matches("-?\\d+")) {
            return true;
        } else return false;
    }
}

