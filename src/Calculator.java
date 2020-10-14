public class Calculator {

    private int a;
    private int b;
    private Operation operation;
    private String rezult;
    private NumbersType type;

    public String getRezult() {
        return rezult;
    }

    public Calculator(int a, int b, Operation operation, NumbersType type) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.type = type;
    }

    public void run() {

        int rezultInt = 0;
        switch (operation) {
            case PLUS:
                rezultInt = a + b;
                break;
            case MINUS:
                rezultInt = a - b;
                break;
            case MULTIPLICATION:
                rezultInt = a * b;
                break;
            case DIVISION:
                rezultInt = a / b;
                break;
        }

        if (type == NumbersType.ARABIC) {
            rezult = RomanNumbers.ArabToRoman(rezultInt);
        }else {
            rezult = Integer.toString(rezultInt);
        }
    }
}
