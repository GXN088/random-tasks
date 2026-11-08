// Базовый класс на вершине иерархии
public class Vehicle {
    // Приватное поле для brand (String)
    private String brand;

    // Конструктор, который принимает brand
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Метод getBrand(), который возвращает brand
    public String getBrand() {
        return brand;
    }

    // Метод move(), который выводит: [brand] is moving
    public void move() {
        System.out.println(brand + " is moving");
    }
}
