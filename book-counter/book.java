class Book {
    // Переменные экземпляра (уникальные для каждой книги)
    private String title;
    private double price;
    
    // Статическая переменная (общая для всех объектов)
    private static int totalBooks = 0;
    
    // Конструктор, принимающий название и цену
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        totalBooks++; // Увеличиваем общее количество книг при создании нового объекта
    }
    
    // Геттер для получения названия
    public String getTitle() {
        return title;
    }
    
    // Геттер для получения цены
    public double getPrice() {
        return price;
    }
    
    // Статический метод, возвращающий общее количество созданных книг
    public static int getTotalBooks() {
        return totalBooks;
    }
}
