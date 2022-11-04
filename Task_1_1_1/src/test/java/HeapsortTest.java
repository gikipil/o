import org.example.Heapsort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс тестирования сортировки кучей.
 */
public class HeapsortTest {

    /**
     * Тестирование обычного списка в неправильном порядке.
     */

    @Test
    public static void sort1() {
        int[] arr = {1, 5, 3, 9, 12, 6, 33};
        System.out.println("Создан массив: 1,5,3,9,12,6,33");
        assertEquals(Heapsort.sort(arr.length, arr), "1 3 5 6 9 12 33 ");
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование списка с повторяющимися элементами.
     */

    @Test
    public static void sort2() {
        int[] arr = {56, 3, 4, 3, 1, 3};
        System.out.println("Создан массив: 56,3,4,3,1,3");
        assertEquals(Heapsort.sort(arr.length, arr), "1 3 3 3 4 56 ");
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование пустого списка.
     */

    @Test
    public static void sort3() {
        int[] arr = {};
        System.out.println("Создан пустой массив");
        assertEquals(Heapsort.sort(arr.length, arr), "");
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование уже отсортированого списка.
     */

    @Test
    public static void sort4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Создан массив: 1,2,3,4,5,6,7,8");
        assertEquals(Heapsort.sort(arr.length, arr), "1 2 3 4 5 6 7 8 ");
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестировани списка с отрицательными значениями.
     */

    @Test
    public static void sort5() {
        int [] arr = {0, -1, -2, -3, -4, -5};
        System.out.println("Создан массив: 0,-1,-2,-3,-4,-5");
        assertEquals(Heapsort.sort(arr.length, arr), "-5 -4 -3 -2 -1 0 ");
        System.out.println("Массив успешно отсортирован!");
    }
}
