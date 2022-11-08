import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.Heapsort;
import org.junit.jupiter.api.Test;


/**
 * Класс тестирования сортировки кучей.
 */
public class HeapsortTest {

    /**
     * Тестирование обычного списка в неправильном порядке.
     */

    @Test
    void sort1() {
        int[] arr = {1, 5, 3, 9, 12, 6, 33};
        int[] ans = {1, 3, 5, 6, 9, 12, 33};
        System.out.println("Создан массив: 1,5,3,9,12,6,33");
        assertArrayEquals(Heapsort.sort(arr), ans);
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование списка с повторяющимися элементами.
     */

    @Test
    void sort2() {
        int[] arr = {56, 3, 4, 3, 1, 3};
        int[] ans = {1, 3, 3, 3, 4, 56};
        System.out.println("Создан массив: 56,3,4,3,1,3");
        assertArrayEquals(Heapsort.sort(arr), ans);
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование пустого списка.
     */

    @Test
    void sort3() {
        int[] arr = {};
        int[] ans = {};
        System.out.println("Создан пустой массив");
        assertArrayEquals(Heapsort.sort(arr), ans);
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестирование уже отсортированого списка.
     */

    @Test
    void sort4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Создан массив: 1,2,3,4,5,6,7,8");
        assertArrayEquals(Heapsort.sort(arr), ans);
        System.out.println("Массив успешно отсортирован!");
    }

    /**
     * Тестировани списка с отрицательными значениями.
     */

    @Test
    void sort5() {
        int [] arr = {0, -1, -2, -3, -4, -5};
        int [] ans = {-5, -4, -3, -2, -1, 0};
        System.out.println("Создан массив: 0,-1,-2,-3,-4,-5");
        assertArrayEquals(Heapsort.sort(arr), ans);
        System.out.println("Массив успешно отсортирован!");
    }
}
