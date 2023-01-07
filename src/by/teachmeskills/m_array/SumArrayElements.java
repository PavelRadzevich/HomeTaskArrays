package by.teachmeskills.m_array;

import java.util.Arrays;
import java.util.Random;

/*
        Многомерные массивы. №4.
    Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
    элементов массива.
 */
public class SumArrayElements {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        final int MAX = 2;
        int[][] a = new int[ARRAY_SIZE][ARRAY_SIZE];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                a[i][j] = random.nextInt(MAX);
            }
        }
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
