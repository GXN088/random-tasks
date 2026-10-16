public class StringUtils {
    
    // Статический метод для подсчета гласных (a, e, i, o, u) без учета регистра
    public static int countVowels(String text) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        String lowerText = text.toLowerCase();
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Статический метод для переворачивания строки
    public static String reverse(String text) {
        if (text == null) {
            return "";
        }
        return new StringBuilder(text).reverse().toString();
    }

    // Статический метод для проверки на палиндром без учета регистра
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String reversed = reverse(text);
        return text.equalsIgnoreCase(reversed);
    }
}
