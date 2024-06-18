import java.util.Scanner;
public class FirstNPrimeNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = scanner.nextInt();
int count = 0;
int num = 2;
System.out.println("First " + n + " prime numbers are:");
while (count < n) {
if (isPrime(num)) {
System.out.print(num + " ");
count++;
}
num++;
}
}
public static boolean isPrime(int num) {
if (num <= 1)
return false;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0)
return false;
}
return true;
}
}
