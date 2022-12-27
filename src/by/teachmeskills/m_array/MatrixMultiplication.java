package by.teachmeskills.m_array;

import java.util.Arrays;

/*
        Многомерные массивы. №3.
    Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для
    умножения двух матриц.
    Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    Ожидаемый результат: 1 2 3  1 1 1  0 0 0

*/
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] a2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] a3 = new int[a1.length][a2[0].length];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2[0].length; j++) {
                for (int k = 0; k < a2.length; k++) {
                    a3[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        System.out.println("Matrix:");
        for (int[] ints : a3) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
