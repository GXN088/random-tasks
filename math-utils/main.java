import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();

        // Вычисления с помощью статических методов MathUtils
        System.out.println("Square: " + MathUtils.square(number));
        System.out.println("Cube: " + MathUtils.cube(number));

        double area = MathUtils.circleArea(number);
        System.out.println(String.format("Circle area (radius=%d): %.2f", number, area));

        // Цикл для создания заданного количества объектов Counter
        for (int i = 0; i < count; i++) {
            Counter counter = new Counter();
            System.out.println("Counter " + counter.getId() + " created");
        }

        // Вывод общего количества через статический метод класса Counter
        System.out.println("Total counters: " + Counter.getTotalCount());

        scanner.close();
    }
}
