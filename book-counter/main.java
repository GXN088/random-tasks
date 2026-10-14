import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // プロчитать входные данные для трёх книг
        String title1 = scanner.nextLine();
        double price1 = Double.parseDouble(scanner.nextLine());
        String title2 = scanner.nextLine();
        double price2 = Double.parseDouble(scanner.nextLine());
        String title3 = scanner.nextLine();
        double price3 = Double.parseDouble(scanner.nextLine()); // ← ここを修正しました
        
        // Создаем три объекта Book, используя входные данные выше
        Book book1 = new Book(title1, price1);
        Book book2 = new Book(title2, price2);
        Book book3 = new Book(title3, price3);
        
        // Выводим название и цену каждой книги в формате: [title]: $[price]
        System.out.println(book1.getTitle() + ": $" + String.format("%.2f", book1.getPrice()));
        System.out.println(book2.getTitle() + ": $" + String.format("%.2f", book2.getPrice()));
        System.out.println(book3.getTitle() + ": $" + String.format("%.2f", book3.getPrice()));
        
        // Выводим общее количество книг, используя статический метод
        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
