package com.company;
/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
 заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если
в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1])
 → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||,
 эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
 отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя
  пользоваться вспомогательными массивами.
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        change1to0();//task1
        three();//task2
        multiplicationToTwo();//task3
        diagonals();//task4
        maxAndMin();//task5
        int[] arr = {7, 8, 12, 3};//task6
        System.out.println(sum(arr));
        int[] arr7 = {0, 1, 2, 3, 4, 5, 6, 7};//task7
        printResult(arrayShift(arr7, 3));
    }

    public static void change1to0() {
        int[] arr = {0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("///////////TASK1///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void three() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("///////////TASK2///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplicationToTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("///////////TASK3///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonals() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.println("///////////TASK4///////////");
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maxAndMin() {
        int[] arr = {3, 5, 7, 1, 8, 15, 17};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("///////////TASK5///////////");
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    public static boolean sum(int[] arr) {
        System.out.println("///////////TASK6///////////");
        for (int i = 1; i < arr.length; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }

    public static int[] arrayShift(int[] array, int n) {
        int[] result = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (n + i < array.length) {
                result[i] = array[n + i];
            } else {
                result[i] = array[counter];
                counter++;
            }
        }
        return result;
    }

    public static void printResult(int[] array) {
        System.out.println("///////////TASK7///////////");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}