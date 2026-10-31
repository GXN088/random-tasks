import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Читаем входные данные
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();
        
        // Создаем объект базового уведомления
        Notification notification = new Notification(message);
        
        // Создаем объект Email-уведомления
        EmailNotification emailNotification = new EmailNotification(message, recipient);
        
        // Вызываем методы отправки
        notification.send();
        emailNotification.send();
        
        scanner.close();
    }
}
