public class SegregateZerosAndOnes {
public static void segregateZerosAndOnes(int[] arr) {
int left = 0;
int right = arr.length - 1;
while (left < right) {
while (arr[left] == 0 && left < right) {
left++;
}
while (arr[right] == 1 && left < right) {
right--;
}
if (left < right) {
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left++;
right--;
}
}
}
public static void main(String[] args) {
int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
System.out.println("Original array:");
printArray(arr);
segregateZerosAndOnes(arr);
System.out.println("Segregated array:");
printArray(arr);
}
public static void printArray(int[] arr) {
for (int num : arr) {
System.out.print(num + " ");
}
System.out.println();
}
}
