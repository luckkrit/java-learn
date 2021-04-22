package ch1_9.lab3;

public class Lab3 {
    public static void main(String[] args) {
        // 1 a)
        int i=20;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);

        // 1 b
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);

        // 2
        float floatA = 1f;
        float floatB = 1.0f;
        if(floatA ==1f && floatB == 1.0f){
            System.out.println("floatA == 1f and floatB == 1.0f");
        }
        if(floatA ==1.0f && floatB == 1f){
            System.out.println("floatA == 1.0f and floatB == 1f");
        }
        // 3
        char a = 'a';
        char b = 'b';
        if(a == 'a' || b == 'b'){
            System.out.println("a == 'a' or b == 'b'");
        }
        if(a == 97 || b == 98){
            System.out.println("a == 97 or b == 98");
        }
    }
}
