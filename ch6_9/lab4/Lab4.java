package ch6_9.lab4;

public class Lab4 {
    static int testVariable = 0;

    static void voidMethod() {
        System.out.println("This is a void method");
    }

    static int returnMethod() {
        return testVariable;
    }

    public static void main(String[] args) {
        System.out.printf("testVariable = %d\n", testVariable);
        voidMethod();
        System.out.println(returnMethod());
    }
}
