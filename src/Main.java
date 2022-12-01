public class Main {
    public static void main(String[] args) {

        Employee employee[] = new Employee[10];
        employee[0] = new Employee("Макаров", "Парамон", "Альбертович", 1, 40_000);
        employee[1] = new Employee("Горбунов", "Пантелей", "Парфеньевич", 5, 60_000);
        employee[2] = new Employee("Власов", "Вячеслав", "Филатович", 2, 45_000);
        employee[3] = new Employee("Евдокимов", "Роман", "Вадимович", 4, 55_000);
        employee[4] = new Employee("Никитин", "Модест", "Максимович", 3, 50_000);
        employee[5] = new Employee("Фокин", "Владислав", "Протасьевич", 1, 40_000);
        employee[6] = new Employee("Казаков", "Гордей", "Донатович", 5, 60_000);
        employee[7] = new Employee("Рогов", "Парамон", "Владимирович", 2, 45_000);
        employee[8] = new Employee("Фролов", "Май", "Лукьянович", 4, 55_000);
        employee[9] = new Employee("Зимин", "Тимофей", "Германнович", 3, 50_000);

        Calculate.printEmployeeList(employee);
        Calculate.calculateEmployeeSalarySumPrint(employee);
        Calculate.calculateMinEmployeeSalaryPrint(employee);
        Calculate.calculateMaxEmployeeSalaryPrint(employee);
        Calculate.calculateAvgEmployeeSalaryPrint(employee);
        Calculate.fullNameEmployeesPrint(employee);
    }
}