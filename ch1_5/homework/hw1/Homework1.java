package ch1_5.homework.hw1;

public class Homework1 {
    public static void main(String[] args) {
        //1.1
        hw1_1(2);
        //1.2
        hw1_2(2);
        //1.3
        hw1_3(2);
        //1.4
        hw1_4(2);
        //1.5
        hw1_5(2);
        //1.6
        hw1_6(2);
        //1.7
        hw1_7(2);
        //1.8
        hw1_8(2);
    }

    static void hw1_1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        sb.append("\n");
        System.out.println(sb);
    }

    static void hw1_2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_3(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_4(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                sb.append(j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_5(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_6(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append((n + 1) - i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_7(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(j + (n * i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw1_8(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                sb.append((i * n) - j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
