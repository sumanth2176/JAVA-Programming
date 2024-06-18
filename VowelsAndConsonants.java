import java.util.Scanner;
public class VowelsAndConsonants {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a string:");
String input = scanner.nextLine().toLowerCase();
int vowelsCount = 0;
int consonantsCount = 0;
StringBuilder vowels = new StringBuilder();
StringBuilder consonants = new StringBuilder();
for (int i = 0; i < input.length(); i++) {
char ch = input.charAt(i);
if (Character.isLetter(ch)) {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowels.append(ch).append(" ");
vowelsCount++;
} else {
consonants.append(ch).append(" ");
consonantsCount++;
}
}
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);
System.out.println("Total Vowels: " + vowelsCount);
System.out.println("Total Consonants: " + consonantsCount);
}
}
