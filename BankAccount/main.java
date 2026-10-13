import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Чтение входных данных
        String accountNumber = scanner.nextLine();
        String ownerName = scanner.nextLine();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();
        
        // Создание объекта BankAccount
        BankAccount account = new BankAccount(accountNumber, ownerName);
        
        // Выполнение депозита и вывод результата
        boolean depositResult = account.deposit(depositAmount);
        System.out.println("Deposit: " + depositResult);
        
        // Выполнение первого снятия средств и вывод результата
        boolean withdrawResult1 = account.withdraw(withdrawAmount1);
        System.out.println("Withdraw 1: " + withdrawResult1);
        
        // Выполнение второго снятия средств и вывод результата
        boolean withdrawResult2 = account.withdraw(withdrawAmount2);
        System.out.println("Withdraw 2: " + withdrawResult2);
        
        // Вывод сводки по счету
        System.out.println(account.getAccountSummary());
        
        scanner.close();
    }
}
