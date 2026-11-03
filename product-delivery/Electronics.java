// Electronics.java — подкласс Product с информацией о гарантии
public class Electronics extends Product {
    // Приватное поле для warrantyYears (int)
    private int warrantyYears;

    // Основной конструктор, который принимает name, price и warrantyYears
    public Electronics(String name, double price, int warrantyYears) {
        // Вызов super(name, price) для инициализации родительского класса
        super(name, price);
        this.warrantyYears = warrantyYears;
        System.out.println("Electronics constructor: " + warrantyYears + " year warranty");
    }

    // Второй конструктор, который принимает name и price
    public Electronics(String name, double price) {
        // Связываем его с основным конструктором для установки 1 года гарантии по умолчанию
        this(name, price, 1);
    }

    // Третий конструктор, который принимает только name
    public Electronics(String name) {
        // Связываем его со вторым конструктором
        this(name, 0.0);
    }

    // Метод getDetails(), возвращающий информацию о товаре с форматированием цены
    public String getDetails() {
        return String.format("%s - $%.2f (%d year warranty)", getName(), getPrice(), warrantyYears);
    }
}
