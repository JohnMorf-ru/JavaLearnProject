import java.util.regex.Pattern;

public class StringParser {

    private String s;
    private Operation operation;
    private int a;
    private int b;
    private NumbersType type;
    private static final String arabRegex = "^[1-9]0?\\s[+-\\/\\*]\\s[1-9]0?$";
    private static final String romanRegex = "";

    public StringParser(String s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public NumbersType getType() {
        return type;
    }

    public Operation getOperation() {
        return operation;
    }

    public void run(){

    }











}
