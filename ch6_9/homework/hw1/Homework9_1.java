package ch6_9.homework.hw1;

import ch6_9.homework.CEO;
import ch6_9.homework.Employee;

public class Homework9_1 {
    public static void main(String[] args) {
        CEO marvel = new CEO("Captain", "Marvel", 30000);
        Employee somsri = new Employee("Somsri", "Sudsuay", 22000);
        somsri.gossip(marvel, "Today is very cold!"); // จงหาที่สร้าง method gossip เพื่อให้ code ตรงนี้เอา comment ออกแล้วสามารถทำงานได้
        marvel.gossip(somsri, "Today is very cold!"); // จงหาที่สร้าง method gossip เพื่อให้ code ตรงนี้เอา comment ออกแล้วสามารถทำงานได้
        marvel.work(somsri);

        marvel.assignNewSalary(somsri, 20);
        marvel.assignNewSalary(somsri, 25000);
    }
}
