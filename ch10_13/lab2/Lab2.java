package ch10_13.lab2;

import ch10_13.lab1.CEO;
import ch10_13.lab1.Programmer;

public class Lab2 {
    public static void main(String[] args) {
        CEO ceo = new CEO("Krit", "Chomaitong", 500000);
        Programmer programmer = new Programmer("Krit", "Chomaitong", 3500);
        System.out.printf("CEO name '%s' has salary '%s'\n", ceo.getEmployeeName(), ceo.getSalary());
        ceo.orderWebsite();
        System.out.printf("Programmer name '%s' has salary '%s'\n", programmer.getEmployeeName(), programmer.getSalary());
        programmer.createWebsite("index.html", "CTF02");
        programmer.formatWindows();
        programmer.installWindows("10", "xxxx-xxxx-xxxx-xxxx-xxxx");
        System.out.printf("Last version of installed Windows is %s", programmer.getLastInstalledWindowsVersion());
    }
}
