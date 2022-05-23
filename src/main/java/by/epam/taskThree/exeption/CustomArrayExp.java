package by.epam.taskThree.exeption;

public class CustomArrayExp extends Exception {
    public CustomArrayExp() {
    }

    public CustomArrayExp (String line){
        super(line);
    }

    public CustomArrayExp (String line, Throwable cause){
        super(line,cause);
    }
}
