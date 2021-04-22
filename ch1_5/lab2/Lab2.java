package ch1_5.lab2;

public class Lab2 {
    public static void main(String[] args) {
        // 1
        bark();
        // 2
        convert();
        // 3
        final String hello = "Hello";
        //hello = "World"; // Final variable is immutable
    }

    public static void bark() {
        String dogName = "Rambo";
        System.out.printf("The Dog name = %s bark\n", dogName);
    }

    public static void convert() {
        int floatToInt = (int) 1.25f;
        float intToFloat = (float) 1;
        float doubleToFloat = (float) 2.23d;
        int charToInt = (int) 'a';
        System.out.printf("float -> int = %d\n", floatToInt);
        System.out.printf("int -> float = %f\n", intToFloat);
        System.out.printf("double -> float = %f\n", doubleToFloat);
        System.out.printf("char -> int = %d\n", charToInt);
    }
}
