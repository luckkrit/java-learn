package ch1_9.lab11;

public class Lab11 {
    public static void noReturn() {
        System.out.println("This is a void method");
    }

    public static int hasReturn() {
        System.out.println("This is a return method");
        return 0;
    }

    public static void main(String[] args) {
        noReturn();
        hasReturn();
    }
}
