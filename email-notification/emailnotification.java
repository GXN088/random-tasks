public class EmailNotification extends Notification {
    private String recipient;

    // Конструктор, вызывающий супер-класс
    public EmailNotification(String message, String recipient) {
        super(message);
        this.recipient = recipient;
    }

    // Переопределение метода отправки для Email
    @Override
    public void send() {
        System.out.println("Emailing " + recipient + ": " + getMessage());
    }
}
