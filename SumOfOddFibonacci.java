import java.util.Scanner;
public class SumOfOddFibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        while (a <= upperBound){
            if (a >= lowerBound && a % 2 != 0){
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("The sum of odd Fibonacci numbers in the range [" + lowerBound + ", " + upperBound + "] is: " + sum);
        scanner.close();
    }
}
