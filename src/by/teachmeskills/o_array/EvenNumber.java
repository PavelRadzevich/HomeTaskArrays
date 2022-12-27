package by.teachmeskills.o_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
        Одномерные массивы. №5.
    Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива
    пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
    Если n не удовлетворяет условию - выведите сообщение об этом. Если пользователь ввёл
    неподходящее число, то программа должна просить пользователя повторить ввод. Создайте
    второй массив только из чётных элементов первого массива, если они там есть,
    и выведите его на экран.
*/
public class EvenNumber {
    public static void main(String[] args) {
        final int MAX = 50;
        int magic;
        int[] a;
        int[] b;
        int c = 0;
        Random random = new Random();
        System.out.println("Создадим массив случайных цифр, заданного размера.");
        System.out.println("Введите число, размер масива, от 5 до 10 включительно. Для выхода нажмите '0': ");
        Scanner sc = new Scanner(System.in);
        magic = sc.nextInt();
        while (magic != 0) {
            if (magic < 5 || magic > 10) {
                System.out.println("Размер массива должен быть от 5 до 10 включительно, повторите ввод. Для выхода нажмите '0'");
                magic = sc.nextInt();
            } else {
                break;
            }
        }
        if (magic != 0) {
            a = new int[magic];
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(MAX);
            }
            for (int k : a) {
                if ((k % 2) == 0) {
                    c++;
                }
            }
            if (c != 0) {
                b = new int[c];
                for (int i = 0, j = 0; i < a.length; i++) {
                    if ((a[i] % 2) == 0) {
                        b[j++] = a[i];
                    }
                }
                System.out.println("a[] " + Arrays.toString(a));
                System.out.println("b[] " + Arrays.toString(b));
            }
        }

    }
}
