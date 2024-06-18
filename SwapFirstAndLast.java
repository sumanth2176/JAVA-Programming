import java.util.Arrays;
import java.util.Scanner;
public class SwapFirstAndLast {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n = scanner.nextInt();
int[] array_nums = new int[n];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
array_nums[i] = scanner.nextInt();
}
scanner.close();
System.out.println("Original Array: " + Arrays.toString(array_nums));
if (n > 1) {
int x = array_nums[0];
array_nums[0] = array_nums[array_nums.length - 1];
array_nums[array_nums.length - 1] = x;
}
System.out.println("New array after swapping the first and last elements: " + Arrays.toString(array_nums));
}
}
