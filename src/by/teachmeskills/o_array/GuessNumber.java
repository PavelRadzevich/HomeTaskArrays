package by.teachmeskills.o_array;

import java.util.Scanner;

/*
        Одномерные массивы. №1.
    Создайте массив целых чисел. Напишете программу, которая выводит
    сообщение о том, входит ли заданное число в массив или нет.
    Пусть число для поиска задается с консоли (класс Scanner)
*/
public class GuessNumber {
    public static void main(String[] args) {
        int[] mass = {3, 5, 8, 12, 19, 1, 10, 15, 7, 1};
        Scanner sc = new Scanner(System.in);
        int magic;

        System.out.println("Введите число(1-20), чтобы узнать, входит ли оно в массив. Для выхода нажмите '0': ");
        magic = sc.nextInt();
        while (magic != 0) {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == magic) {
                    System.out.println("Такое число есть в массиве.");
                    break;
                }
                if (i == mass.length - 1) System.out.println("Нет такого числа в массиве.");
            }
            System.out.println("Введите число(1-20), чтобы узнать, входит ли оно в массив. Для выхода нажмите '0': ");
            magic = sc.nextInt();
        }
    }
}