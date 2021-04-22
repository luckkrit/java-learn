package ch1_5.lab5;

public class Lab5 {
    public static void main(String[] args) {
        int score = 100;
        switch (score) {
            case 80:
                System.out.println("You got A");
                break;
            case 70:
                System.out.println("You got B");
                break;
            case 60:
                System.out.println("You got C");
                break;
            case 50:
                System.out.println("You got D");
                break;
            case 40:
                System.out.println("You got F");
                break;
            default:
                System.out.println("You got E");
                break;
        }
    }
}
