import java.util.Scanner;
public class MthMaxNthMin {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the length of the array: ");
int len = scanner.nextInt();
int[] arr = new int[len];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < len; i++) {
arr[i] = scanner.nextInt();
}
System.out.print("Enter the value of m (to find the m-th maximum): ");
int m = scanner.nextInt();
System.out.print("Enter the value of n (to find the n-th minimum): ");
int n = scanner.nextInt();
for (int i = 0; i < len; i++) { 
for (int j = i + 1; j < len; j++) { 
if (arr[i] > arr[j]) { 
int temp = arr[i]; 
arr[i] = arr[j]; 
arr[j] = temp; 
} 
} 
}
int max = arr[len - m]; 
int min = arr[n - 1]; 
System.out.println(m + " maximum number = " + max); 
System.out.println(n + " minimum number = " + min); 
int sum = max + min; 
int diff = max - min; 
System.out.println("Sum = " + sum); 
System.out.println("Difference = " + diff); 
scanner.close();
}
}
