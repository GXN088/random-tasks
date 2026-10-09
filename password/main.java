import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Прочитать пароль для установки
        String passwordToSet = scanner.nextLine();
        // Прочитать попытку ввода пароля для проверки
        String passwordAttempt = scanner.nextLine();
        
        // Создать объект Password с минимальной длиной 6
        Password userPassword = new Password(6);
        
        // Установить пароль и вывести результат ("Set: true" или "Set: false")
        boolean isSet = userPassword.setPassword(passwordToSet);
        System.out.println("Set: " + isSet);
        
        // Вывести замаскированный пароль ("Masked: ******")
        System.out.println("Masked: " + userPassword.getMaskedPassword());
        
        // Проверить попытку ввода пароля и вывести результат ("Match: true" или "Match: false")
        boolean isMatch = userPassword.checkPassword(passwordAttempt);
        System.out.println("Match: " + isMatch);
        
        scanner.close();
    }
}
