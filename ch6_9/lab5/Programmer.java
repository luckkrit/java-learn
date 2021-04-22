package ch6_9.lab5;

import ch6_9.lab3.Employee;

public class Programmer extends Employee {
    private String specialize;

    public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String specialize) {
        super(firstnameInput, lastnameInput, salaryInput);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }
}
