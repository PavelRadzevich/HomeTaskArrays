package by.teachmeskills.o_array;

import java.util.Arrays;
import java.util.Random;

/*
        Одномерные массивы. №4.
    Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
    Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
*/
public class AverageNumber {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        final int MAX = 50;
        int[] a1 = new int[ARRAY_SIZE];
        int[] a2 = new int[ARRAY_SIZE];
        int s1 = 0, s2 = 0;
        Random random = new Random();
        float average1, average2;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            a1[i] = random.nextInt(MAX);
            a2[i] = random.nextInt(MAX);
        }
        System.out.println("Random array A1:");
        System.out.println(Arrays.toString(a1));
        System.out.println("Random array A2:");
        System.out.println(Arrays.toString(a2));

        for (int i = 0; i < ARRAY_SIZE; i++) {
            s1 = s1 + a1[i];
            s2 = s2 + a2[i];
        }
        average1 = (float) s1 / ARRAY_SIZE;
        average2 = (float) s2 / ARRAY_SIZE;
        if (average1 > average2) {
            System.out.println("Average A1 = " + average1 + " > Average A2 = " + average2);
        } else if (average1 < average2) {
            System.out.println("Average A2 = " + average2 + " > Average A1 = " + average1);
        } else System.out.println("Average A1 = " + average1 + " = Average A2 = " + average2);
    }
}
