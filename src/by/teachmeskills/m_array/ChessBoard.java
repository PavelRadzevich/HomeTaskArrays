package by.teachmeskills.m_array;

import java.util.Arrays;

/*
        Многомерные массивы. №2.
    Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный
    массив String'ов 8х8. С помощью циклов задать элементам массива значения B(Black) или W(White).
    Результат работы программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
*/
public class ChessBoard {
    public static void main(String[] args) {
        var chess = new char[8][8];   //Может достаточно типа char для элементов массива?

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = 'W';
                } else {
                    chess[i][j] = 'B';
                }
            }
        }
        for (char[] chars : chess) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
