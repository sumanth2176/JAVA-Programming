import java.util.Scanner;
import java.util.Arrays;
public class InsertElement {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();
int[] originalArray = new int[size];
System.out.println("Enter elements of the array:");
for (int i = 0; i < size; i++) {
originalArray[i] = scanner.nextInt();
}
System.out.print("Enter the element to be inserted: ");
int newElement = scanner.nextInt();
System.out.print("Enter the position at which the element is to be inserted: ");
int position = scanner.nextInt();
System.out.println("Original Array: " + Arrays.toString(originalArray));
int[] newArray = insertElement(originalArray, newElement, position);
System.out.println("Array after insertion: " + Arrays.toString(newArray));
scanner.close();
}
public static int[] insertElement(int[] originalArray, int element, int position) {
int[] newArray = new int[originalArray.length + 1];
for (int i = 0; i < position; i++) {
newArray[i] = originalArray[i];
}
newArray[position] = element;
for (int i = position; i < originalArray.length; i++) {
newArray[i + 1] = originalArray[i];
}
return newArray;
}
}
