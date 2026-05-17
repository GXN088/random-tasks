import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        HashMap<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;
        
        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
            for (int j = 0; j < textArray[i].length; j++) {
                if (!textArray[i][j].isEmpty()) {
                    totalWords++;
                    String word = textArray[i][j]
                        .replaceAll("[^a-zA-Z ]", "")
                        .toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        
        int maxCount = Collections.max(wordCount.values());
        int minCount = Collections.min(wordCount.values());
        
        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + wordCount.size());
        
        System.out.println("Word statistics:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            double percentage = (entry.getValue() * 100.0) / totalWords;
            System.out.printf("%s: %d (%.2f%%)\n", 
                entry.getKey(), entry.getValue(), percentage);
        }
    }
}
