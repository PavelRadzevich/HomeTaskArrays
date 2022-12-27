package by.teachmeskills.o_array;

import java.util.Arrays;
import java.util.Random;

/*
        Одномерные массивы. №6.
    Создайте массив и заполните массив. Выведите массив на экран в строку.
    Замените каждый элемент с нечётным индексом на ноль.
    Снова выведете массив на экран на отдельной строке
*/
public class RemoveEvenNumber {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        final int MAX = 20;
        int[] a1 = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = random.nextInt(MAX);
        }
        System.out.println("Random array:");
        System.out.println(Arrays.toString(a1));
        for (int i = 0; i < a1.length; i++) {
            if (i % 2 != 0) {
                a1[i] = 0;
            }
        }
        System.out.println("An array with odd-indexed members replaced:");
        System.out.println(Arrays.toString(a1));
    }
}