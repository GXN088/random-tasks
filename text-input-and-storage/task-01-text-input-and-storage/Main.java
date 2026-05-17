import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        
        // Напишите свой код здесь
        
        // Проходим по каждому предложению
        for (int i = 0; i < sentences.length; i++) {
            // Удаляем лишние пробелы в начале и конце, затем разбиваем на слова
            String trimmedSentence = sentences[i].trim();
            
            // Если предложение не пустое, разбиваем на слова
            if (!trimmedSentence.isEmpty()) {
                textArray[i] = trimmedSentence.split(" ");
            } else {
                // Если предложение пустое, создаём пустой массив
                textArray[i] = new String[0];
            }
        }
        
        // Выводим все слова в формате "Word[row,col]: word"
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                System.out.println("Word[" + i + "," + j + "]: " + textArray[i][j]);
            }
        }
    }
}
