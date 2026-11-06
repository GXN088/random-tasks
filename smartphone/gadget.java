public class Gadget {
    // Приватные поля
    private String name;
    private int year;

    // Конструктор, инициализирующий оба поля
    public Gadget(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    
    // Методы Object НЕ переопределяем, чтобы сохранить поведение по умолчанию
}
