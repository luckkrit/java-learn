package ch1_9.lab12;

public class Lab12 {
    public static void main(String[] args) {
        char chars[] = new char[]{'h', 'e', 'l', 'l', 'o'};
        String aString = new String(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("chars[%d] = %c\n", i, chars[i]);
        }
        System.out.println("aString from chars[] = " + aString);
    }
}
