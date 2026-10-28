import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brand = scanner.nextLine();
        int wattage = scanner.nextInt();
        int capacity = scanner.nextInt();

        WashingMachine wm = new WashingMachine(brand, wattage, capacity);
        System.out.println(wm.getInfo());
        
        scanner.close();
    }
}
