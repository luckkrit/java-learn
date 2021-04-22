package ch1_9.lab9;

public class Lab9 {
    public static void main(String[] args) {
        // 1.a
        for (int count = 0; count <= 20; count++) {
            System.out.println("count = " + count);
        }
        // 1.b
        for (int count = 0; count <= 20; count++) {
            System.out.println("count = " + count);
            if (count == 11) continue;
        }
        // 1.c
        for (int count = 0; count <= 20; count++) {
            if (count == 11) continue;
            else {
                System.out.println("count = " + count);
            }
        }
    }
}
