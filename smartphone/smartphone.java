public class Smartphone extends Gadget {
    // Приватное поле для бренда
    private String brand;

    // Конструктор, вызывающий родительский через super()
    public Smartphone(String name, int year, String brand) {
        super(name, year);
        this.brand = brand;
    }

    // Геттер
    public String getBrand() {
        return brand;
    }

    // Переопределенный метод toString() для понятного вывода данных
    @Override
    public String toString() {
        return "Smartphone: " + brand + " " + getName() + " (" + getYear() + ")";
    }
}
