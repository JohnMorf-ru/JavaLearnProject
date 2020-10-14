import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            StringParser sp = new StringParser(s);
            sp.run();

            Calculator calculator = new Calculator(sp.getA(), sp.getB(), sp.getOperation(), sp.getType());
            calculator.run();
            System.out.println(calculator.getRezult());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
