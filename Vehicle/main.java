import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считать входные данные
        String carModel = scanner.nextLine();
        int numDoors = Integer.parseInt(scanner.nextLine());
        String motorcycleModel = scanner.nextLine();
        boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());

        // Создать объекты Car и Motorcycle
        Car car = new Car(carModel, numDoors);
        Motorcycle motorcycle = new Motorcycle(motorcycleModel, hasSidecar);

        // Создать массив ссылок Vehicle
        Vehicle[] vehicles = {car, motorcycle};

        // Пройти по массиву и выполнить проверки
        for (Vehicle vehicle : vehicles) {
            vehicle.inspect();

            if (vehicle instanceof Car) {
                Car c = (Car) vehicle;
                c.checkDoors();
            }

            if (vehicle instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) vehicle;
                m.checkSidecar();
            }
        }
    }
}
