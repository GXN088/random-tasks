import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        // Очищаем текст от знаков препинания и приводим к нижнему регистру
        String processedText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        // Разбиваем на слова
        String[] words = processedText.split("\\s+");
        
        // Подсчитываем частоту слов
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // Выводим результат
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
