public class Product {
    private String name;
    private double price;
    private int stock;

    // Конструктор с 3 параметрами: инициализирует все поля
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Конструктор с 2 параметрами: вызывает конструктор с 3 параметрами, передавая stock = 0
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Конструктор по умолчанию: вызывает конструктор с 2 параметрами (name = "Unknown", price = 0)
    public Product() {
        this("Unknown", 0.0);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }
}
