package by.teachmeskills.o_array;

import java.util.Arrays;
import java.util.Random;

/*
        Одномерные массивы. №7.
    Преобразовать массив так, чтобы сначала шли нулевые элементы, а затем все остальные.
*/
public class ZeroFirstNumber {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 15;
        final int MAX = 2;
        int[] a = new int[ARRAY_SIZE];
        Random random = new Random();
        int k = 0;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            a[i] = random.nextInt(MAX);
        }
        System.out.println("Random array:");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (a[i] == 0) {
                for (int j = i; j > k; j--) {
                    a[j] = a[j - 1];
                }
                a[k++] = 0;
            }
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(a));
    }
}