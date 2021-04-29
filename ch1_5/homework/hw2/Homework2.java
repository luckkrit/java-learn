package ch1_5.homework.hw2;

public class Homework2 {
    public static void main(String[] args) {
        String[][] table = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        multiplyTable(table);
    }

    static void multiplyTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = String.valueOf(Integer.parseInt(table[i][j]) * 2);
                System.out.print(table[i][j]);
                if (j < table[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
