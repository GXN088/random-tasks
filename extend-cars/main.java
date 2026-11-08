import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считать входные данные
        String brand = scanner.nextLine();
        int wheels = scanner.nextInt();
        scanner.nextLine(); // пропустить символ новой строки
        String model = scanner.nextLine();
        
        // Создать объект Car с введенными значениями
        Car myCar = new Car(brand, wheels, model);
        
        // Вызвать move() — унаследовано от Vehicle (прародитель)
        myCar.move();
        
        // Вызвать honk() — унаследовано от LandVehicle (родитель)
        myCar.honk();
        
        // Вызвать displayInfo() — определено в самом Car
        myCar.displayInfo();
        
        scanner.close();
    }
}
