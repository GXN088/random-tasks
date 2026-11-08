// Класс нижнего уровня, который расширяет LandVehicle
public class Car extends LandVehicle {
    // Приватное поле для model (String)
    private String model;

    // Конструктор, который принимает brand, wheels и model
    public Car(String brand, int wheels, String model) {
        // Использование super(brand, wheels) для родительской части
        super(brand, wheels);
        this.model = model;
    }

    // Метод getModel(), который возвращает model
    public String getModel() {
        return model;
    }

    // Метод displayInfo(), который выводит: [brand] [model] with [wheels] wheels
    public void displayInfo() {
        System.out.println(getBrand() + " " + model + " with " + getWheels() + " wheels");
    }
}
