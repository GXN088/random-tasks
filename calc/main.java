import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Чтение входных данных
        double radius = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        // Создание объектов фигур
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(width, height);
        
        // Хранение в массиве ссылок базового абстрактного типа
        Shape[] shapes = {circle, rectangle};
        
        // Вывод описания каждой фигуры
        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }
        
        // Подсчет общей площади
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        
        // Вывод результата
        System.out.println("Total area: " + String.format("%.2f", totalArea));
        
        scanner.close();
    }
}
