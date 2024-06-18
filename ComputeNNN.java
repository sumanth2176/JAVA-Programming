import java.util.Scanner;
public class ComputeNNN {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");
        int n = num.nextInt();
        int nn = n * n;
        int nnn = n * n * n;
        int result = n + nn + nnn;
        System.out.println("The result of n + nn + nnn is: " + result);
        num.close();
    }
}
