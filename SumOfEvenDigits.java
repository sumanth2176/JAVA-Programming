public class SumOfEvenDigits {
    public static void main(String[] args) {
        int number = 984833;
        int sum = sumOfEvenDigits(number);
        System.out.println("Sum of even digits: " + sum);
    }

    public static int sumOfEvenDigits(int number) {
        int sum = 0;
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }
}
