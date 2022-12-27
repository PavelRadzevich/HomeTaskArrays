package by.teachmeskills.m_array;

import java.util.Random;
import java.util.Scanner;

/*
        Многомерные массивы. №1.
    Создать трехмерный массив из целых чисел.С помощью циклов "пройти" по всему массиву и увеличить
    каждый элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
    задается из консоли.
*/
public class IncArray3DElement {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;
        final int MAX = 20;
        int c;
        var threeD = new int[ARRAY_SIZE][ARRAY_SIZE][ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD.length; j++) {
                for (int k = 0; k < threeD.length; k++) {
                    threeD[i][j][k] = random.nextInt(MAX);
                }
            }
        }
        for (int[][] ints : threeD) {
            for (int j = 0; j < threeD.length; j++) {
                for (int k = 0; k < threeD.length; k++) {
                    System.out.print(ints[j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Введите число, на которое будет увеличиваться каждый элемент массива: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD.length; j++) {
                for (int k = 0; k < threeD.length; k++) {
                    threeD[i][j][k] += c;
                }
            }
        }
        for (int[][] ints : threeD) {
            for (int j = 0; j < threeD.length; j++) {
                for (int k = 0; k < threeD.length; k++) {
                    System.out.print(ints[j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
