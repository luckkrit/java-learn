package ch10_13.lab1;

import ch10_13.lab2.IWebsiteCreator;
import ch10_13.lab2.IWindowsInstaller;
import ch6_9.lab3.Employee;

public class Programmer extends Employee implements IWebsiteCreator, IWindowsInstaller {
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }

    public void createWebsite(String template, String titleName) {
        System.out.printf("Create website '%s' from '%s'", titleName, template);
    }

    @Override
    public void formatWindows() {
        System.out.println("Formatting windows.");
    }

    public void installWindows(String version, String productKey) {

        System.out.printf("Install Windows '%s' by using product key '%s'", version, productKey);
    }

    @Override
    public String getLastInstalledWindowsVersion() {
        return "10";
    }
}
