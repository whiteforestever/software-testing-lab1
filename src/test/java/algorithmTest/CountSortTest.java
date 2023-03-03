package algorithmTest;

import algorithm.CountSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSortTest {

    @Test
    void testCountSort() {
        int[] arr = {4, 2, 10, 5, 8};
        int[] expectedOutput = {2, 4, 5, 8, 10};
        CountSort.countSort(arr);
        Assertions.assertArrayEquals(expectedOutput, arr);
    }

    @Test
    void testCountSortWithNegativeValues() {
        int[] arr = {-3, 2, 10, -5, 8};
        int[] expectedOutput = {-5, -3, 2, 8, 10};
        CountSort.countSort(arr);
        Assertions.assertArrayEquals(expectedOutput, arr);
    }

    @Test
    void testCountSortWithDuplicateValues() {
        int[] arr = {3, 1, 2, 3, 1, 2, 3};
        int[] expectedOutput = {1, 1, 2, 2, 3, 3, 3};
        CountSort.countSort(arr);
        Assertions.assertArrayEquals(expectedOutput, arr);
    }

    @Test
    void testCountSortWithEmptyArray() {
        int[] arr = {};
        int[] expectedOutput = {};
        CountSort.countSort(arr);
        Assertions.assertArrayEquals(expectedOutput, arr);
    }

    @Test
    void testCountSortWithSingleValueArray() {
        int[] arr = {5};
        int[] expectedOutput = {5};
        CountSort.countSort(arr);
        Assertions.assertArrayEquals(expectedOutput, arr);
    }
}
