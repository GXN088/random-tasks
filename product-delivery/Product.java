// Product.java - Родительский класс для всех продуктов
public class Product {
    // Приватные поля для name (String) и price (double)
    private String name;
    private double price;

    // Основной конструктор, который принимает name и price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product constructor: " + name);
    }

    // Второй конструктор, который принимает только name
    public Product(String name) {
        // Вызываем основной конструктор
        this(name, 0.0);
    }

    // Геттеры для доступа к приватным полям
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
