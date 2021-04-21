package ch1_9.lab1;

public class Lab1 {
    public static void main(String[] args) {
        // 1
        // Single line comment
        /*
           Multiple line Comment
         */

        // 2
        int anInt = 0;
        boolean aBoolean = true;
        String aString = "A string";
        double aDouble = 1.5d;
        float aFloat = 1.25f;

        // 3
        printVariable(anInt);
        printVariable(aBoolean);
        printVariable(aString);
        printVariable(aDouble);
        printVariable(aFloat);
    }
    public static void printVariable(int anInt){
        String formatText = "This is an %s %d\n";
        System.out.printf(formatText, getTypeName(anInt), anInt);
    }
    public static void printVariable(boolean aBoolean){
        String formatText = "This is a %s %b\n";
        System.out.printf(formatText, getTypeName(aBoolean), aBoolean);
    }
    public static void printVariable(String aString){
        String formatText = "This is a %s %s\n";
        System.out.printf(formatText, getTypeName(aString), aString);

    }
    public static void printVariable(double aDouble){
        String formatText = "This is a %s %f\n";
        System.out.printf(formatText, getTypeName(aDouble), aDouble);
    }
    public static void printVariable(float aFloat){
        String formatText = "This is a %s %f\n";
        System.out.printf(formatText, getTypeName(aFloat), aFloat);
    }
    public static String getTypeName(int anInt){
        return ((Object)anInt).getClass().getTypeName();
    }
    public static String getTypeName(boolean aBoolean){
        return ((Object)aBoolean).getClass().getTypeName();
    }
    public static String getTypeName(String aString){
        return ((Object)aString).getClass().getTypeName();
    }
    public static String getTypeName(double aDouble){
        return ((Object)aDouble).getClass().getTypeName();
    }
    public static String getTypeName(float aFloat){
        return ((Object)aFloat).getClass().getTypeName();
    }
}
