public class Notification {
    private String message;

    // Конструктор
    public Notification(String message) {
        this.message = message;
    }

    // Геттер для получения сообщения в подклассах
    public String getMessage() {
        return message;
    }

    // Базовый метод отправки
    public void send() {
        System.out.println("Sending notification: " + message);
    }
}
