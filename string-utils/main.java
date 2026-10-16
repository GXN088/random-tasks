import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Вызов статических методов напрямую через имя класса StringUtils
        int vowelCount = StringUtils.countVowels(text);
        String reversedText = StringUtils.reverse(text);
        boolean isPalin = StringUtils.isPalindrome(text);

        // Вывод результатов в строго заданном формате
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Reversed: " + reversedText);
        System.out.println("Palindrome: " + isPalin);
        
        scanner.close();
    }
}
