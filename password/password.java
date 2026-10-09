class Password {
    // Приватное поле password (String), в котором хранится сам пароль
    private String password;
    
    // Приватное поле minLength (int), определяющее минимально допустимую длину пароля
    private int minLength;
    
    // Конструктор, принимающий требование к минимальной длине
    public Password(int minLength) {
        this.minLength = minLength;
        this.password = null; // Изначально пароль не установлен
    }
    
    // Сеттер setPassword, контролирующий правила безопасности
    public boolean setPassword(String password) {
        if (password != null && password.length() >= this.minLength) {
            this.password = password;
            return true;
        }
        return false;
    }
    
    // Геттер getMaskedPassword(), скрывающий настоящий пароль
    public String getMaskedPassword() {
        if (this.password == null) {
            return "";
        }
        // Заменяем каждый символ пароля на звездочку
        return "*".repeat(this.password.length());
    }
    
    // Метод checkPassword для безопасной проверки совпадения
    public boolean checkPassword(String attempt) {
        if (this.password == null) {
            return false;
        }
        return this.password.equals(attempt);
    }
    
    // Геттер getLength(), возвращающий длину текущего пароля
    public int getLength() {
        if (this.password == null) {
            return 0;
        }
        return this.password.length();
    }
}
