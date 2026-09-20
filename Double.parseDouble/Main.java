public class Main {
    public static void main(String[] args) {
        // Используем полные пути к классам Scanner и Locale, чтобы избежать проблем с import
        java.util.Scanner scanner = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
        double sum = 0.0;

        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                double number = Double.parseDouble(token);
                sum += number;
            } catch (NumberFormatException e) {
                // Игнорируем токены, которые не являются числами
            }
        }

        // Выводим результат с точкой в качестве разделителя и 6 знаками после запятой
        System.out.printf(java.util.Locale.US, "%.6f%n", sum);
    }
}
