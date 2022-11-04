package org.example;

/**
 * Класс сортировки кучей, содержащий метод сортировки.
 */
public class Heapsort {
    /** Метод sort класса Heapsort является статичным публичным методом.
     * Не требует обьявление обьекта для использования.
     * @param len - длина массива, типа Int.
     * @param list - непосредственно массив, который нужно отсортировать.
     *             Массив должен быть типа Int/
     * @return возвращает Строку типа String с отсортированным массивом.
     *             Элементы разделены знаком " ".
     */
    public static String sort (int len, int [] list) {
        int a = 0;
        int [] arr = list;
        if (arr.length == 0) {
            return "";
        }
        for (int i = len / 2; i >= 0; i--) {
            int max;
            int flag = 0;
            int up = i;
            while ((up * 2 <= len - 1) && (flag == 0)) {
                if (up * 2 == len - 1) {
                    max = up * 2;
                } else {
                    if (arr[up * 2] > arr[up * 2 + 1]) {
                        max = up * 2;
                    } else {
                        max = up * 2 + 1;
                    }
                }
                if (arr[up] < arr[max]) {
                    a = arr[up];
                    arr[up] = arr[max];
                    arr[max] = a;
                    up = max;
                } else {
                    flag = 1;
                }
            }
        }
        for (int i = len - 1; i >= 1; i--) {
            a = arr[0];
            arr[0] = arr[i];
            arr[i] = a;
            int max;
            int flag = 0;
            int up = 0;
            int down = i - 1;
            while ((up * 2 <= down) && (flag == 0)) {
                if (up * 2 == down) {
                    max = up * 2;
                } else {
                    if (arr[up * 2] > arr[up * 2 + 1]) {
                        max = up * 2;
                    } else {
                        max = up * 2 + 1;
                    }
                }
                if (arr[up] < arr[max]) {
                    a = arr[up];
                    arr[up] = arr[max];
                    arr[max] = a;
                    up = max;
                } else {
                    flag = 1;
                }
            }
        }
        String ans = "";
        for (int i : arr) {
            ans = ans + i + " ";
        }
        return ans;
    }
}