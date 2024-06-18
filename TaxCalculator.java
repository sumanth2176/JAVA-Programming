import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.println("Tax to be paid: " + tax);
        scanner.close();
    }
    public static double calculateTax(double income) {
        double tax = 0;   
        if (income <= 250000) {
            tax = 0;
        } else if (income>250000 && income <= 500000) {
            tax = income * 0.1;
        } else if (income>500000 && income <= 1000000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }
        return tax;
    }
}
