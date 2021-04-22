package ch1_9.lab7;

public class Lab7 {
    public static void main(String[] args) {
        // 1
        int i = 20;
        do {
            System.out.println("i = " + i);
            i--;
        } while (i > -1);

        // 2
        int input = 1;
        do {
            System.out.print("input = " + input);
            if (input % 2 == 0) {
                System.out.println(" and input is even");
            } else {
                System.out.println(" and input is odd");
            }
        } while (input % 2 == 0);
    }
}
