public class Book {
    private String title;
    private String author;
    private int pages;

    // TODO: Создайте конструктор, который принимает title, author и pages
    // Используйте ключевое слово this для присвоения каждого параметра своему полю
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // TODO: Создайте геттер getTitle()
    public String getTitle() {
        return title;
    }

    // TODO: Создайте геттер getAuthor()
    public String getAuthor() {
        return author;
    }

    // TODO: Создайте геттер getPages()
    public int getPages() {
        return pages;
    }

    // TODO: Создайте метод getSummary(), который возвращает:
    // <title> by <author> (<pages> pages)
    public String getSummary() {
        return title + " by " + author + " (" + pages + " pages)";
    }
}
