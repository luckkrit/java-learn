package ch6_9.lab1;

public class MethodDemo {
    public static int specialBonus = 0;

    public static void main(String[] args) {
        //int variableFromMethod = add(1,2);
        //System.out.println(variableFromMethod);

        int ans = add(3, 4);
        System.out.println(ans);
        int ans2 = add(ans, 2);
        System.out.println(ans2);
        int ans3 = add(ans2, 10, 10);
        System.out.println(ans3);
        int ans4 = subtract(ans3, 3);
        System.out.println(ans4);
        int ans5 = addAndSubtract(3, 4, 1);
        System.out.println(ans5);
        String ans6 = add("123", "456");
        System.out.println(ans6);
        int ans7 = multiply(2, 10);
        System.out.println(ans7);
        int ans8 = 0;
        try {
            ans8 = divideBy(ans7, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ans8);

        specialBonus = 100;
        ans = add(3, 4);
        System.out.println(ans);
        ans2 = add(ans, 2);
        System.out.println(ans2);
        ans3 = add(ans2, 10, 10);
        System.out.println(ans3);
        ans4 = subtract(ans3, 3);
        System.out.println(ans4);
        ans5 = addAndSubtract(3, 4, 1);
        System.out.println(ans5);

    }

    public static int add(int a, int b) {
        int answer = (a + b) * 2;

        return specialBonus + answer;
    }

    public static int add(int a, int b, int c) {
        int answer = a + b + c;

        return specialBonus + answer;
    }

    public static String add(String a, String b) {
        String answer = a + b;
        return specialBonus + answer;
    }

    public static int subtract(int a, int b) {
        int answer = a - b;

        return specialBonus + answer;
    }

    /**
     * Multiply number
     *
     * @param a
     * @param b
     * @return
     */
    public static int multiply(int a, int b) {
        int answer = a * b;
        return specialBonus + answer;
    }

    /**
     * Divide number
     *
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public static int divideBy(int a, int b) throws Exception {
        if (b == 0) throw new Exception("b is zero");
        int answer = a / b;
        return specialBonus + answer;
    }

    public static int addAndSubtract(int a, int b, int c) {
        int firstAnswer = add(a, b);
        int secondAnswer = subtract(firstAnswer, c);
        return specialBonus + secondAnswer;
    }
}
