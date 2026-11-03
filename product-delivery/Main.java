import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считать входные данные
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int warrantyYears = scanner.nextInt();
        
        // Создаем объект Electronics, используя все три параметра
        Electronics laptop = new Electronics(name, price, warrantyYears);
        
        // Выводим результат getDetails()
        System.out.println(laptop.getDetails());
        
        scanner.close();
    }
}
