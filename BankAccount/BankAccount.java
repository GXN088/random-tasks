public class BankAccount {
    //Приватные поля класса
    private final String accountNumber;
    private String ownerName;
    private double balance = 0.0;
    
    //Конструктор
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    //Геттеры
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    //Метод для пополнения баланса
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }
    
    //Метод для снятия средств
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    //Сводка по счету
    public String getAccountSummary() {
        return String.format("Account %s | Owner: %s | Balance: $%s", 
                this.accountNumber, 
                this.ownerName, 
                String.format("%.2f", this.balance));
    }
}
