import java.util.Locale;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return name + " earns $" + String.format(Locale.US, "%.2f", salary);
    }

    public void work() {
        System.out.println(name + " is working");
    }
}
