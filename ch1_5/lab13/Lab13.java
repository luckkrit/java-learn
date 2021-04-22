package ch1_5.lab13;

public class Lab13 {
    public static void main(String[] args) {
        // 1
        int[][] d2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumLastColumn = 0;
        for (int[] row : d2) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
                if (j == row.length - 1) {
                    sumLastColumn += row[j];
                }
            }
            System.out.println();
        }
        // 2
        System.out.println("Sum of last column from 2D array = " + sumLastColumn);

    }
}
