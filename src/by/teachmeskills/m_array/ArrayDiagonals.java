package by.teachmeskills.m_array;

import java.util.Arrays;
import java.util.Random;

/*
        Многомерные массивы. №5.
    Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class ArrayDiagonals {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 6;
        final int MAX = 5;
        int[][] a = new int[ARRAY_SIZE][ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                a[i][j] = random.nextInt(MAX);
            }
        }
        System.out.println("Random array:");
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Main diagonal");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
        System.out.println("Side diagonal");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i][a.length - 1 - i] + " ");
        }
    }
}
