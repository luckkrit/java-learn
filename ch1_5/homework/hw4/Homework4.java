package ch1_5.homework.hw4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.print("Please enter multiplication table : ");
        Scanner in = new Scanner(System.in);
        try {

            int n = in.nextInt();
            multiplicationTable(n);
        } catch (InputMismatchException ignored) {

        }

    }

    static void multiplicationTable(int n) {
        for (int i = 1; i < 13; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
