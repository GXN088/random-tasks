import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();

        // Создаем объект Motorcycle
        Motorcycle myBike = new Motorcycle(brand);
        
        // Вызов унаследованного метода родительского класса
        myBike.start();
        
        // Вызов уникального метода дочернего класса
        myBike.wheelie();
        
        scanner.close();
    }
}
