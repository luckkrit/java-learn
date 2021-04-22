package ch6_9.lab3;

public class Lab3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Krit", "Chomaitong", 5000),
                new Employee("Krit2", "Chomaitong", 3330)
        };
        for (Employee employee : employees) {
            System.out.printf("Employee name '%s %s' has salary $%d\n",
                    employee.firstname, employee.lastname, employee.getSalary());
        }
    }
}
