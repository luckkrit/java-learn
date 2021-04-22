package ch1_5.lab4;

public class Lab4 {
    public static void main(String[] args) {
        // 1
        int score = 100;
        if (score >= 80) {
            System.out.println("Good");
        } else if (score >= 50 && score < 80) {

            System.out.println("normal");
        } else {
            System.out.println("fail");
        }
        // 2
        boolean isHandSome = true;
        score = 40;
        if (score >= 80 || isHandSome) {
            System.out.println("Good");
        } else if (score >= 50 && score < 80) {

            System.out.println("normal");
        } else {
            System.out.println("fail");
        }
    }
}
