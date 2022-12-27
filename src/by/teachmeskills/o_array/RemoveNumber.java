package by.teachmeskills.o_array;
/*
        Одномерные массивы. №2.
    Создайте массив целых чисел. Удалите все вхождения заданного
    числа из массива. Пусть число задается с консоли (класс Scanner).
    Если такого числа нет - выведите сообщение об этом. В результате должен
    быть новый массив без указанного числа.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        final int MAX = 10;
        int number;
        int[] a1 = new int[ARRAY_SIZE];
        int[] b1;
        int c = 0;
        Random random = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = random.nextInt(MAX);
        }
        System.out.println(Arrays.toString(a1));
        System.out.print("Какое число удалить из массива?:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int k : a1) {
            if (k == number) {
                c++;
            }
        }
        if (c != 0) {
            b1 = new int[ARRAY_SIZE - c];
            for (int i = 0, j = 0; i < a1.length; i++) {
                if (a1[i] != number) {
                    b1[j++] = a1[i];
                }
            }
            System.out.println(Arrays.toString(b1));
        } else {
            System.out.println("Нет такого числа в массиве.");
        }
    }
}
