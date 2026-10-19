// Файл: GameConfig.java
public class GameConfig { 
    // Приватные статические переменные
    private static int[] levelThresholds; 
    private static int maxLevel; 
    private static boolean configLoaded; 

    // Первый статический блок
    static { 
        maxLevel = 5;
        System.out.println("Initializing game configuration...");
    } 

    // Второй статический блок
    static { 
        levelThresholds = new int[maxLevel];
        for (int i = 0; i < maxLevel; i++) {
            // Уровни начинаются с 1, поэтому (i + 1) * 100
            levelThresholds[i] = (i + 1) * 100;
        }
        configLoaded = true;
    } 

    // Метод возвращает порог очков для конкретного уровня (с 1)
    public static int getThreshold(int level) { 
        if (level < 1 || level > maxLevel) {
            return 0; // Защита от некорректного ввода уровня
        }
        return levelThresholds[level - 1]; 
    } 

    // Метод возвращает максимальный уровень
    public static int getMaxLevel() { 
        return maxLevel; 
    } 

    // Метод возвращает статус загрузки конфигурации
    public static boolean isConfigLoaded() { 
        return configLoaded; 
    } 
}
