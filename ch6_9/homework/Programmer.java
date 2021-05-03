package ch6_9.homework;

public class Programmer extends Employee {
    private String type;
    private int id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Programmer() {
        super("", "", 0);
    }

    public Programmer(String firstnameInput, String lastnameInput, int salaryInput, int id, String type) {
        super(firstnameInput, lastnameInput, salaryInput);
        this.type = type;
        this.id = id;
    }
}
