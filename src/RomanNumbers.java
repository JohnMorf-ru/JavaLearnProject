import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanNumbers {

    private static final int[] intValues = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] romanValues = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String ArabToRoman(int arabNum){

        StringBuilder rezult = new StringBuilder();
        for (int i = intValues.length - 1; i >= 0; i--) {
            while(arabNum >= intValues[i]) {
                arabNum -= intValues[i];
                rezult.append(romanValues[i]);
            }
        }

        return rezult.toString();



    }

    public static int RomanToArab(String s){
        int rezult = 0;
        int preValue = 0;

        String symbol = Character.toString(s.charAt(s.length() - 1));
        for (int i = 0; i < romanValues.length - 1; i ++){
            if (symbol.equals(romanValues[i])){
                rezult += intValues[i];
                preValue = intValues[i];
            }
        }

        for(int i = s.length() - 2; i >= 0; i--) {
            symbol = Character.toString(s.charAt(i));
            for (int k = 0; k < romanValues.length - 1; k++){
                if(symbol.equals(romanValues[k])){
                    if (intValues[k] < preValue) {
                        rezult -= intValues[k];
                        preValue = intValues[k];
                    } else {
                        rezult += intValues[k];
                        preValue = intValues[k];
                    }
                }
            }


        }
        return rezult;
    }

}
