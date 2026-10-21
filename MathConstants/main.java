import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем радиус из консоли
        double radius = scanner.nextDouble();
        
        // Вычисляем площадь, используя MathConstants.PI
        double area = MathConstants.PI * radius * radius;
        
        // Вычисляем длину окружности, используя MathConstants.PI
        double circumference = 2 * MathConstants.PI * radius;
        
        // Вычисляем золотой диаметр, используя MathConstants.GOLDEN_RATIO
        double goldenDiameter = 2 * radius * MathConstants.GOLDEN_RATIO;
        
        // Выводим результаты, отформатированные до 2 знаков после запятой
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Circumference: " + String.format("%.2f", circumference));
        System.out.println("Golden Diameter: " + String.format("%.2f", goldenDiameter));
        
        scanner.close();
    }
}
