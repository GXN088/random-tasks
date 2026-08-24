import java.util.function.DoubleUnaryOperator;

public class Integrator {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h = 1e-6; // Шаг сетки
        double sum = 0.0;
        
        // Количество шагов
        long n = (long) Math.ceil((b - a) / h);
        // Корректируем шаг, чтобы точно покрыть интервал (или используем фиксированный)
        // Простой вариант суммирования по левым прямоугольникам:
        double currentStep = (b - a) / n; // или строго h <= 1e-6
        // Если строго по условию шаг не больше 1e-6:
        double step = 1e-6;
        if (b - a < step) {
            step = b - a;
        }
        
        double x = a;
        while (x < b) {
            sum += f.applyAsDouble(x) * step;
            x += step;
        }
        
        return sum;
    }
}
