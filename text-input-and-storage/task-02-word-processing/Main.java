import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        
        // Заполняем массив словами
        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
        }
        
        // Выводим оригинальные и обработанные слова
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                String originalWord = textArray[i][j];
                if (!originalWord.isEmpty()) {
                    // Очищаем слово: удаляем знаки препинания и приводим к нижнему регистру
                    String processedWord = originalWord.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                    
                    System.out.println("Original[" + i + "," + j + "]: " + originalWord);
                    System.out.println("Processed[" + i + "," + j + "]: " + processedWord);
                }
            }
        }
    }
}
