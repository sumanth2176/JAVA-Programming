import java.util.ArrayList;
import java.util.Scanner;
public class PositiveAndNegativeAvg {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Double> positiveNumbers = new ArrayList<>();
ArrayList<Double> negativeNumbers = new ArrayList<>();
System.out.println("Enter -1 to exit…");
while (true) {
System.out.print("Enter the number: ");
double num = scanner.nextDouble();
if (num == -1) {
break;
} else if (num > 0) {
positiveNumbers.add(num);
} else if (num < 0) {
negativeNumbers.add(num);
}
}
scanner.close();
double avgPositive = calculateAverage(positiveNumbers);
double avgNegative = calculateAverage(negativeNumbers);
System.out.println("The average of negative numbers is: " + avgNegative);
System.out.println("The average of positive numbers is: " + avgPositive);
}
private static double calculateAverage(ArrayList<Double> numbers) {
if (numbers.isEmpty()) {
return 0;
}
double sum = 0;
for (double num : numbers) {
sum += num;
}
return sum/numbers.size();
}
}