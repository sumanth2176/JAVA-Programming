import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDecimalITOX {

    public static int romanToDecimal(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        
        int decimal = 0;
        int length = roman.length();
        
        for (int i = 0; i < length; i++) {
            int current = romanMap.get(roman.charAt(i));
            int next = (i + 1 < length) ? romanMap.get(roman.charAt(i + 1)) : 0;
            
            if (current < next) {
                decimal -= current;
            } else {
                decimal += current;
            }
        }
        
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Roman numeral (up to X): ");
        String roman = scanner.nextLine().toUpperCase();
        
        int decimal = romanToDecimal(roman);
        
        System.out.println("Roman numeral: " + roman + " = Decimal: " + decimal);
        
        scanner.close();
    }
}
