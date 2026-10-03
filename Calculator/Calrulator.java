public class Calculator {
    // Приватные поля
    private String name;
    private double memory;
    private int operationCount;

    // Конструктор по умолчанию, использующий цепочку вызовов this()
    public Calculator() {
        this("Default"); // Вызываем параметризованный конструктор
    }

    // Параметризованный конструктор
    public Calculator(String name) {
        this.name = name;
        this.memory = 0.0;
        this.operationCount = 0;
    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public double getMemory() {
        return this.memory;
    }

    public int getOperationCount() {
        return this.operationCount;
    }

    // Метод сложения: сохраняет результат в memory и увеличивает operationCount
    public double add(double a, double b) {
        this.memory = a + b;
        this.operationCount++;
        return this.memory;
    }

    // Метод вычитания: увеличивает operationCount
    public double subtract(double a, double b) {
        this.operationCount++;
        return a - b;
    }

    // Метод умножения: увеличивает operationCount
    public double multiply(double a, double b) {
        this.operationCount++;
        return a * b;
    }

    // Метод деления: возвращает 0 при делении на ноль, увеличивает operationCount
    public double divide(double a, double b) {
        this.operationCount++;
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    // Метод возведения в степень: использует Math.pow(), увеличивает operationCount
    public double power(double base, double exponent) {
        this.operationCount++;
        return Math.pow(base, exponent);
    }
}
