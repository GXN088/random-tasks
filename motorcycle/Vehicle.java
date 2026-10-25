public class Vehicle {
    // Приватное поле для марки транспортного средства
    private String brand;

    // Конструктор, принимающий название бренда
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Метод, возвращающий бренд (нужен подклассам, так как поле brand приватное)
    public String getBrand() {
        return brand;
    }

    // Метод запуска транспортного средства
    public void start() {
        System.out.println(brand + " is starting");
    }
}
