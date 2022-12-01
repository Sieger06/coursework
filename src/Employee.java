import java.util.Objects;

public class Employee {
    private final String name;
    private final String middleName;
    private final String lastName;
    private int department;
    private final double salary;
    private static int counter = 1;
    private final int id;
    public Employee(String name, String middleName, String lastName, int department, double salary){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        if (checkDepartmentValue(department)) {
        }
        this.salary = salary;
        id = counter;
        counter++;
    }
    public void setDepartment(int department) {
        if (checkDepartmentValue(department)) {
            this.department = department;
        }
    }
    private boolean checkDepartmentValue(int department) {
        if (department > 5 || department <= 0) {
            throw new IllegalArgumentException("Значение отдела должно быть от 1 до 5.");
        }
        return true;
    }
    public static int getCounter() {
        return counter;
    }
    public int getId(){
        return id;
    }
    public int setId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        return name;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String setMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String setLastName(){
        return lastName;
    }
    public int getDepartment() {
        return department;
    }
    public int setDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public double setSalary() {
        return salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }
    public String toString() {
        return String.format("Номер в реестре: %d, Ф.И.О.: %s %s %s, Отдел: %s, Зарплата: %S рублей.",id, name, middleName, lastName, department, salary);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, lastName, department, salary);
    }
}