package ch10_13.lab3;

import java.util.ArrayList;
import java.util.Arrays;

class Employee {
    String firstName, lastName;
    int salary;

    public void work() {

    }

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void hello() {
        System.out.println("Hello");
    }
}

interface IFixPC {
    void fixPC();
}

interface IInstallWindows {
    void installWindows();
}

class Programmer extends Employee implements IWebsiteCreator, IFixPC, IInstallWindows {

    public Programmer(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public void createWebsite() {

    }

    @Override
    public void fixPC() {

    }

    @Override
    public void installWindows() {

    }

    @Override
    public void hello() {
        System.out.printf("Hello %s\n", this.firstName);
    }

    @Override
    public void work() {
        createWebsite();
        fixPC();
        installWindows();
    }
}

interface IKillCockroach {
    void killCockroach();
}

interface IDecorateRoom {
    void decorateRoom();
}

interface IWelcomeGuest {
    void welcomeGuest();
}

class OfficeCleaner extends Employee implements IKillCockroach, IDecorateRoom, IWelcomeGuest {
    public OfficeCleaner(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    void clean() {

    }

    @Override
    public void work() {
        clean();
        killCockroach();
        decorateRoom();
        welcomeGuest();
    }

    @Override
    public void killCockroach() {

    }

    @Override
    public void decorateRoom() {

    }

    @Override
    public void welcomeGuest() {

    }
}

interface IGolf {
    void golf();
}

class CEO extends Employee implements IGolf {
    public CEO(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    void seminar() {

    }

    void hire() {

    }

    void fire() {
    }

    @Override
    public void hello() {
        System.out.printf("Hi, nice to meet you. %s!\n", this.firstName);

    }

    @Override
    public void work() {
        seminar();
        hire();
        golf();
        fire();
    }

    @Override
    public void golf() {

    }

    public void orderWebsite(IWebsiteCreator iWebsiteCreator) {

    }
}

public class PolymorphismCasting {
    public static void main(String[] args) {
        Employee dang = new Employee("Dang", "Red", 10000);
        Employee ceo = new CEO("Captain", "Marvel", 30000);
        Programmer prog = new Programmer("Captain", "Marvel", 2000);
        CEO ceo2 = (CEO) ceo;
        // CEO ceo3 = new Employee("Captain", "Marvel", 30000); // Error
        // CEO ceo4 = (CEO) dang; // Error
        ArrayList<Employee> myList = new ArrayList<>(Arrays.asList(ceo2, dang, prog));
        CEO ceo3 = (CEO) myList.get(0);
        Employee dang2 = myList.get(1);
        Programmer prog2 = (Programmer) myList.get(2);
        ceo3.hello();
        prog2.hello();
    }
}
