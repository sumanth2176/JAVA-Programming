import java.util.Scanner;
public class TextOperations {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String text = "";
boolean exit = false;
while (!exit) {
System.out.println("\nMenu:");
System.out.println("1. Enter Text");
System.out.println("2. Length of the given text");
System.out.println("3. Find the subset of the given text");
System.out.println("4. Count vowels and consonants of the given text");
            System.out.println("5. Count number of words and sentences in the given text");
            System.out.println("6. Check if the given text is palindrome");
            System.out.println("7. Convert the given text into uppercase and vice versa");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the text: ");
                    text = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Length of the given text: " + text.length());
                    break;
                case 3:
                    System.out.print("Enter the start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end index: ");
                    int end = scanner.nextInt();
                    System.out.println("Subset of the given text: " + getSubset(text, start, end));
                    break;
                case 4:
                    countVowelsAndConsonants(text);
                    break;
                case 5:
                    countWordsAndSentences(text);
                    break;
                case 6:
                    System.out.println("Is palindrome: " + isPalindrome(text));
                    break;
                case 7:
                    System.out.println("Uppercase: " + text.toUpperCase());
                    System.out.println("Lowercase: " + text.toLowerCase());
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }

    public static String getSubset(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return "Invalid indices!";
        }
        return text.substring(start, end);
    }

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void countWordsAndSentences(String text) {
        if (text.isEmpty()) {
            System.out.println("Words: 0");
            System.out.println("Sentences: 0");
            return;
        }

        String[] words = text.split("\\s+");
        String[] sentences = text.split("[.!?]");
        
        System.out.println("Words: " + words.length);
        System.out.println("Sentences: " + sentences.length);
    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
