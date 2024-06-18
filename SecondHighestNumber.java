public class SecondHighestNumber {
public static void main(String[] args) {
int[] numbers = {11,9,8,12,16,24,1};
int secondHighest = findSecondHighest(numbers);
System.out.println("The second highest number is: " + secondHighest);
}
public static int findSecondHighest(int[] arr) {
int firstMax = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;
for (int num : arr) {
if (num > firstMax) {
secondMax = firstMax;
firstMax = num;
} else if (num > secondMax && num != firstMax) {
secondMax = num;
}
}
return secondMax;
}
}
