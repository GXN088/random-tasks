// Класс среднего уровня, который расширяет Vehicle
public class LandVehicle extends Vehicle {
    // Приватное поле для wheels (int)
    private int wheels;

    // Конструктор, который принимает brand и wheels
    public LandVehicle(String brand, int wheels) {
        // Использование super(brand) для родительской части
        super(brand);
        this.wheels = wheels;
    }

    // Метод getWheels(), который возвращает количество колес
    public int getWheels() {
        return wheels;
    }

    // Метод honk(), который выводит: [brand] honks!
    public void honk() {
        System.out.println(getBrand() + " honks!");
    }
}
