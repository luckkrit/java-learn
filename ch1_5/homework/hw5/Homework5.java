package ch1_5.homework.hw5;

import java.util.Arrays;
import java.util.Collections;

public class Homework5 {
    public static void main(String[] args) {
        //5.1
        hw5_1(5);
        //5.2
        hw5_2(5);
        //5.3
        hw5_3(5);
        //5.4
        hw5_4(5);
        //5.5
        hw5_5(5);
        //5.6
        hw5_6(5);
        //5.7
        hw5_7(5);
        //5.8
        hw5_8(4);
    }

    static void hw5_1(int n) {
        String[][] table = new String[n][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "-";
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i >= j) {
                    table[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < table.length; i++) {
            Collections.reverse(Arrays.asList(table[i]));
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_2(int n) {
        String[][] table = new String[n][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "-";
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i >= j) {
                    table[i][j] = "*";
                }
            }
        }


        for (int i = table.length - 1; i > -1; i--) {
            for (int j = table[i].length - 1; j > -1; j--) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_3(int n) {
        String[][] table = new String[(2 * n) - 1][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    table[i][j] = "_";
                } else {
                    table[i][j] = "*";
//                        table[i][j] = "" + (i + 1);
                }
            }
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
//                        table[(2 * n - 1) - i][j] = "" + i;
                    table[(2 * n - 1) - i][j] = "*";
                } else {
                    table[(2 * n - 1) - i][j] = "_";
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            Collections.reverse(Arrays.asList(table[i]));
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_4(int n) {
        String[][] table = new String[(2 * n) - 1][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    table[i][j] = "_";
                } else {
                    table[i][j] = "*";
//                        table[i][j] = "" + (i + 1);
                }
            }
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
//                        table[(2 * n - 1) - i][j] = "" + i;
                    table[(2 * n - 1) - i][j] = "*";
                } else {
                    table[(2 * n - 1) - i][j] = "_";
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            Collections.reverse(Arrays.asList(table[i]));
        }
        int count = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("*")) {
                    table[i][j] = new String(String.valueOf(count));
                    count++;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_5(int n) {
        int maxColumn = (2 * n) - 1;
        String[][] table = new String[n][maxColumn];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = 0; i < table.length; i++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[i][j + k] = "*";
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_6(int n) {
        int maxColumn = (2 * n) - 1;
        String[][] table = new String[n][maxColumn];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = table.length - 1, l = 0; i > -1; i--, l++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[l][j + k] = "*";
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_7(int n) {

        int maxColumn = (2 * n) - 1;
        String[][] table = new String[maxColumn][maxColumn];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = 0; i < table.length; i++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[i][j + k] = "*";
                }
            }
        }
        for (int i = n - 1,
             l = (maxColumn / 2);
             i > -1 && l < maxColumn;
             i--, l++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[l][j + k] = "*";
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hw5_8(int n) {

        int maxColumn = (2 * n) - 1;
        String[][] table = new String[maxColumn][maxColumn];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "_";
            }
        }
        for (int i = 0; i < table.length; i++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[i][j + k] = "*";
                }
            }
        }
        for (int i = n - 1,
             l = (maxColumn / 2);
             i > -1 && l < maxColumn;
             i--, l++) {
            int perRow = (2 * (i + 1)) - 1;
            int offset = (maxColumn / 2) - (perRow / 2);
            if (offset > -1) {

                for (int j = offset, k = 0; k < perRow; k++) {
                    table[l][j + k] = "*";
                }
            }
        }
        int count = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("*")) {
                    table[i][j] = String.valueOf(count);
                    count++;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
