import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считывание входных данных
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после считывания int
        String brand = scanner.nextLine();

        // Создание объектов
        Gadget gadget = new Gadget(name, year);
        Smartphone smartphone = new Smartphone(name, year, brand);

        // 1. Вывод имени класса гаджета
        System.out.println(gadget.getClass().getSimpleName());
        
        // 2. Проверка стандартного toString() на наличие символа "@"
        System.out.println(gadget.toString().contains("@"));
        
        // 3. Вывод смартфона через переопределенный toString()
        System.out.println(smartphone);
        
        scanner.close();
    }
}
