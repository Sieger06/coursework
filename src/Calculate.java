public class Calculate {
    public static void printEmployeeList(Employee[] employees) {
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void calculateEmployeeSalarySumPrint(Employee[] employees) {
        System.out.println("Затраты на зарплату сотрудников: " + calculateEmployeeSalarySum(employees));
    }
    private static double calculateEmployeeSalarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }
    public static  void calculateMinEmployeeSalaryPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculateMinEmployeeSalary(employees)) {
                    System.out.println("Сотрудник с минимальной зарплатой - " + employee);
                }
            }
        }
    }
    private static double calculateMinEmployeeSalary(Employee[] employees){
        double minSalaryEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalaryEmployee = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalaryEmployee) {
                    minSalaryEmployee = employees[i].getSalary();
                }
            }
        }
        return minSalaryEmployee;
    }
    public static void calculateMaxEmployeeSalaryPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculateMaxEmployeeSalary(employees)) {
                    System.out.println("Сотрудник с максимальной зарплатой " + employee);
                }
            }
        }
    }
    private static double calculateMaxEmployeeSalary(Employee[] employees) {
        double maxEmployeeSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxEmployeeSalary) {
                    maxEmployeeSalary = employee.getSalary();
                }
            }
        }
        return maxEmployeeSalary;
    }

    public static void calculateAvgEmployeeSalaryPrint(Employee[] employees) {
        System.out.println("Средняя зарплата сотрудников составляет: " + calculateAvgEmployeeSalary(employees));
    }

    private static double calculateAvgEmployeeSalary(Employee[] employees) {
        double averageSalary;
        int elementCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                elementCount++;
            }
        }
        averageSalary = calculateEmployeeSalarySum(employees) / elementCount;
        return averageSalary;
    }

    public static void fullNameEmployeesPrint(Employee[] employees) {
        StringBuilder sb = new StringBuilder();
        sb.append("ФИО всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                String s = employee.getName() + " " + employee.getMiddleName() + " " + employee.getLastName();
                sb.append(s).append("\n");
            }
        }
        String fullName = sb.toString();
        System.out.println(fullName);
    }
}
