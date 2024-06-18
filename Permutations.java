import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Permutations {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
scanner.close();
List<String> result = generatePermutations(String.valueOf(num));
for (String perm : result) {
System.out.println(perm);
}
}
public static List<String> generatePermutations(String str) {
List<String> permutations = new ArrayList<>();
if (str == null || str.length() == 0) {
return permutations;
}
char[] chars = str.toCharArray();
permute(chars, 0, permutations);
return permutations;
}
private static void permute(char[] chars, int currentIndex, List<String> permutations) {
if (currentIndex == chars.length - 1) {
permutations.add(new String(chars));
} else {
for (int i = currentIndex; i < chars.length; i++) {
swap(chars, currentIndex, i);
permute(chars, currentIndex + 1, permutations);
swap(chars, currentIndex, i);
}
}
}
private static void swap(char[] chars, int i, int j) {
char temp = chars[i];
chars[i] = chars[j];
chars[j] = temp;
}
}
