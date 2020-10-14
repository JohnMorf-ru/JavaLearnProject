import java.util.regex.Pattern;

public class StringParser {

    private String s;
    private Operation operation;
    private int a;
    private int b;
    private NumbersType type;
    private static final String arabRegex = "^(\\d{1,3})\\s[-+\\/\\*]\\s(\\d{1,3})$";
    private static final String romanRegex = "^(M{0,3})^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])\\s[-+\\/\\*]\\s(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$";

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

    public void run() throws Exception {

        if (Pattern.matches(romanRegex, s)){
            type = NumbersType.ROME;
        } else if (Pattern.matches(arabRegex, s)){
            type = NumbersType.ARABIC;
        } else {
            throw new Exception("Неверный формат записи");
        }

        String[] values = s.split(" ");

        if (type == NumbersType.ROME) {
            a = RomanNumbers.RomanToArab(values[0]);
            b = RomanNumbers.RomanToArab(values[2]);
    }
        if (type == NumbersType.ARABIC){
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[2]);
        }

        String op = values[1];

        if (op.equals("-")){
            operation = Operation.MINUS;
        }
        if (op.equals("+")){
            operation = Operation.PLUS;
        }
        if (op.equals("/")){
            operation = Operation.DIVISION;
        }
        if (op.equals("*")){
            operation = Operation.MULTIPLICATION;
        }

    }














}
