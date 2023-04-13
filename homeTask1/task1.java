/*  Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 Метод должен пройтись по каждому элементу и проверить что он не равен null.
 А теперь реализуйте следующую логику:
 Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
*/
package homeTask1;

import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        // очистка консоли
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Integer[] arr = new Integer[8];
        fillArray(arr);
        checkArray(arr);
    }

    // метод заполнения массива
    public static void fillArray(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    // метод для проверки на null
    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Элемент под №" + i + " " + "== null ");

            } else {
                System.out.println("Элемент под №" + i + " " + "=! null ");
            }
        }
    }
}
