/*
     Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
     Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
package homeTask1;

import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        // очистка консоли
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int[] arr = new int[10]; // возможен вариант, когда длину массивов выбирает
        int[] arr1 = new int[10];// сам пользователь
        int[] arr2 = new int[10];
        int[] result = new int[10];

        // заполнение массива arr1
        int[] tmp = fillArray(arr);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = tmp[i];
        }

        // заполнение массива arr2
        int[] tmp1 = fillArray(arr);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = tmp1[i];
        }

        // заполнение массива result
        int[] tmp2 = addArrays(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            result[i] = tmp2[i];
        }

        System.out.printf("\nПервый массив:");
        printArray(arr1);

        System.out.printf("\nВторой массив:");
        printArray(arr2);

        if (arr1.length != arr2.length) {
            System.exit(0);
        }
        System.out.printf("\nРезультирующий массив:");
        printArray(result);

    }

    // новый массив на основе двух заданных
    public static int[] addArrays(int[] array1, int[] array2) {
        int[] resultArray = new int[Math.max(array1.length, array2.length)];

        try {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = array1[i] + array2[i];
            }
        } catch (Exception e) {
            System.out.printf("МАССИВЫ РАЗНОЙ ДЛИНЫ!" + " " + "\nException:" + e);
        }
        return resultArray;
    }

    // создание рандомного массива
    private static int[] fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

        }
        return arr;
    }

    // печать массива
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
