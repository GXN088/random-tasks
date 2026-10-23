public class MathUtils {
    // Публичные константы
    public static final double PI = 3.14159;
    public static final double HALF = 0.5;

    // Закрытый конструктор, чтобы предотвратить создание объектов
    private MathUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    // Статический метод для возведения в квадрат
    public static int square(int n) {
        return n * n;
    }

    // Статический метод для возведения в куб
    public static int cube(int n) {
        return n * n * n;
    }

    // Статический метод для вычисления площади круга
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}
