package by.teachmeskills.o_array;

import java.util.Arrays;
import java.util.Scanner;

/*
        Одномерные массивы. №3.
    Создайте и заполните массив случайным числами и выведете
    максимальное, минимальное и среднее значение. Для генерации случайного числа
    используйте метод Math.random(). Пусть будет возможность создавать массив произвольного размера.
    Пусть размер массива вводится с консоли.
*/
public class RandomNumber {
    public static void main(String[] args) {
        final int MAX = 50;
        final int MIN = 0;
        int magic;
        int[] a;
        int max_a, min_a;
        int sum = 0;

        System.out.println("Создадим массив случайных цифр, заданного размера.");
        System.out.println("Введите целое число, размер масива. Для выхода нажмите '0': ");
        Scanner sc = new Scanner(System.in);
        magic = sc.nextInt();
        while (magic != 0) {
            if (magic < 0) {
                System.out.println("Размер массива должен быть положительным числом, повторите ввод. Для выхода нажмите '0'");
                magic = sc.nextInt();
            } else {
                break;
            }
        }
        if (magic != 0) {
            a = new int[magic];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * (MAX - MIN));
            }
            min_a = a[0];
            max_a = a[0];
            for (int j : a) {
                if (j > max_a) {
                    max_a = j;
                }
                if (j < min_a) {
                    min_a = j;
                }
                sum += j;
            }
            System.out.println(Arrays.toString(a));
            System.out.println("Минимальное значение массива: " + min_a);
            System.out.println("Максимальное значение массива: " + max_a);
            System.out.println("Среднее значение массива: " + (sum / magic));
        }
    }
}