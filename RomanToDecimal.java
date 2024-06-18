import java.util.Scanner;
public class RomanToDecimal {
public static int value(char c) {
switch (c) {
case 'I': return 1;
case 'V': return 5;
case 'X': return 10;
case 'L': return 50;
case 'C': return 100;
case 'D': return 500;
case 'M': return 1000;
default: return -1;
}
}
public static int romantodecimal(String str) {
int res = 0;
for (int i = 0; i < str.length(); i++) {
int s1 = value(str.charAt(i));
if (s1 == -1) {
throw new IllegalArgumentException("Invalid Roman numeral character: " + str.charAt(i));
}
if (i + 1 < str.length()) {
int s2 = value(str.charAt(i + 1));
if (s1 >= s2) {
res = res + s1;
} else {
res = res + s2 - s1;
i++;
}
} else {
res = res + s1;
}
}
return res;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a Roman numeral: ");
String str = input.next();
input.close();
if (str.isEmpty()) {
System.out.println("Input cannot be empty.");
return;
}
try {
System.out.println("Decimal value: " + romantodecimal(str));
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
}
}
}
