package ch1_5.lab8;

public class Lab8 {
    public static void main(String[] args) {
        // 1.a
        int count = 0;
        while (count <= 20) {
            System.out.println("count = " + count);
            count++;
        }
        // 1.b
        count = 0;
        while (count <= 20) {
            System.out.println("count = " + count);
            if (count == 11) {
                break;
            }
            count++;
        }
        // 1.c
        count = 0;
        while (count <= 20) {
            if (count == 11) {
                System.out.println("count = " + count);
                break;
            } else {
                System.out.println("count = " + count);
            }
            count++;
        }
    }
}
