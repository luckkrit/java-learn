package ch1_5.homework.hw3;

public class Homework3 {
    public static void main(String[] args) {
        //3.1
        hw3_1(4);
        //3.2
        hw3_2(4);
        //3.3
        hw3_3(4);
        //3.4
        hw3_4(3);
        //3.5
        hw3_5(4);
        //3.6
        hw3_6(3);
        //3.7
        hw3_7(4);
        //3.8
        hw3_8(1);
        //3.9
        hw3_9(1);
    }

    static void hw3_1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i * 2);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i * 2);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_3(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(j * i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_4(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    sb.append("_");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_5(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j == i) {
                    sb.append("_");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_6(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    sb.append("_");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_7(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    sb.append("*");
                } else {
                    sb.append("_");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void hw3_8(int n) {
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
                }
            }
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    table[(2 * n - 1) - i][j] = "*";
                } else {
                    table[(2 * n - 1) - i][j] = "_";
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

    static void hw3_9(int n) {
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
                    table[i][j] = "" + (i + 1);
                }
            }
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    table[(2 * n - 1) - i][j] = "" + i;
                } else {
                    table[(2 * n - 1) - i][j] = "_";
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
