package ch1_9.lab12;

import java.util.Locale;

public class Lab12 {
    public static void main(String[] args) {
        // from previous lab
        char chars[] = new char[]{'h', 'e', 'l', 'l', 'o'};
        String aString = new String(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("chars[%d] = %c\n", i, chars[i]);
        }
        System.out.println("aString from chars[] = " + aString);

        // 12
        String string1 = "You and Me", string2 = " you and me ";
        // 12.1
        System.out.printf("%s and %s are the same? \n", string1, string2);
        // 12.2
        String find = "You";
        System.out.printf("Looking for '%s' in '%s', found? %b\n", find, string1, string1.contains(find));
        // 12.3
        System.out.printf("Length of %s is %d\n", string1, string1.length());
        // 12.4
        System.out.printf("Substring of %d to %d is %s\n", 1, 4, string1.substring(1, 4));
        // 12.5
        System.out.printf("Before trim '%s', after trim '%s'\n", string1, string1.trim());
        // 12.6
        System.out.printf("Convert '%s' to upper '%s'\n", string1, string1.toUpperCase(Locale.ROOT));
        // 12.7
        System.out.printf("Convert '%s' to upper and trim '%s'\n", string2, string2.trim().toUpperCase(Locale.ROOT));
        // Optional
        printName();
    }

    //Optional
    public static void printName() {
        String name = "Krit";
        String surname = "Chomaitong";
        System.out.printf("%s %s", name.toLowerCase(), surname.toLowerCase().substring(0, surname.length() - 1)
                + surname.substring(surname.length() - 1).toUpperCase());
    }
}
