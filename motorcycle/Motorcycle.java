public class Motorcycle extends Vehicle {

    // Конструктор принимает бренд и передает его родителю через super()
    public Motorcycle(String brand) {
        super(brand);
    }

    // Собственный метод мотоцикла, использующий геттер родителя
    public void wheelie() {
        System.out.println(getBrand() + " is doing a wheelie!");
    }
}
