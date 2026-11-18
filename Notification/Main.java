import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String recipient = scanner.nextLine();
        String subject = scanner.nextLine();
        String phoneNumber = scanner.nextLine();

        Notification[] notifications = new Notification[3];
        notifications[0] = new Notification(recipient);
        notifications[1] = new EmailNotification(recipient, subject);
        notifications[2] = new SMSNotification(recipient, phoneNumber);

        for (Notification notification : notifications) {
            notification.send();
        }
        
        scanner.close();
    }
}
