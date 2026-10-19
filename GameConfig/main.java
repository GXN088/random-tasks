// Файл: Main.java
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int level = scanner.nextInt(); 

        // При первом обращении к GameConfig автоматически выполнятся его статические блоки
        System.out.println("Config loaded: " + GameConfig.isConfigLoaded()); 
        
        System.out.println("Max level: " + GameConfig.getMaxLevel()); 
        
        System.out.println("Level " + level + " threshold: " + GameConfig.getThreshold(level)); 
        
        System.out.println("Level 1 threshold: " + GameConfig.getThreshold(1)); 
    } 
}
