public class Student {
    // Поля final, которые нельзя изменить после инициализации
    private final String studentId;
    private final int enrollmentYear;
    
    // Обычное приватное поле, доступное для изменения
    private String name;

    // Конструктор, принимающий все три значения
    public Student(String studentId, String name, int enrollmentYear) {
        this.studentId = studentId;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }

    // Геттер для идентификатора студента
    public String getStudentId() {
        return studentId;
    }

    // Геттер для года поступления
    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени (позволяет обновлять значение)
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения сводной информации о студенте
    public String getInfo() {
        return "ID: " + studentId + " | Name: " + name + " | Enrolled: " + enrollmentYear;
    }
}
