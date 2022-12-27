package by.teachmeskills.m_array;

import java.util.Arrays;
import java.util.Random;

/*
        Многомерные массивы. №6.
    Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class SortArrayRows {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        final int MAX = 6;
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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                for (int k = 0; k < a.length - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted array:");
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }
}