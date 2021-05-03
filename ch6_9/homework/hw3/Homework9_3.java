package ch6_9.homework.hw3;

import ch6_9.homework.CEO;
import ch6_9.homework.Employee;
import ch6_9.homework.Programmer;

public class Homework9_3 {
    public static void main(String[] args) {
        String[] rawData = {
                "id:1001 firstname:Luke lastname:Skywalker salary:10000 type:frontend",
                "id:1002 firstname:Tony lastname:Stark salary:20000 type:backend",
                "id:1003 firstname:Somchai lastname:Jaidee salary:30000 type:fullstack",
                "id:1004 firstname:MonkeyD lastname:Luffee salary:40000 type:fullstack"
        };
        Employee[] employees = new Employee[rawData.length];
        for (int i = 0; i < rawData.length; i++) {
            employees[i] = createProgrammer(rawData[i]);
        }
        CEO ceo = new CEO("Captain", "Marvel", 50000);
        ceo.setEmployees(employees);
        ceo.showEmployees();
    }

    static Programmer createProgrammer(String data) {
        String[] details = data.split(" ");
        int id = Integer.parseInt(details[0].split(":")[1]);
        String firstName = details[1].split(":")[1];
        String lastName = details[2].split(":")[1];
        int salary = Integer.parseInt(details[3].split(":")[1]);
        String type = details[4].split(":")[1];

        return new Programmer(firstName, lastName, salary, id, type);
    }
}
