package ch10_13.lab3;

public class PrimitiveConversion {
    public static void main(String[] args) {
        int myInt = 5;
        float myFloat = myInt;
        System.out.printf("myInt value: %d\n", myInt);
        System.out.printf("myFloat value: %f\n", myFloat);

        float newFloat = 5.5f;
        int newInt = (int) newFloat;
        System.out.printf("myInt value: %d\n", newInt);
        System.out.printf("myFloat value: %f\n", newFloat);

        int otherInt = 130;
        byte myByte = (byte) otherInt;
        System.out.printf("otherInt value: %d\n", otherInt);
        System.out.printf("myByte value: %d\n", myByte);
    }

}
