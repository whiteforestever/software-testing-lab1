package algorithmTest;

import algorithm.CountSort;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CountSortTest {

    @Test
    void testCountSortWhite() {
        int[] arr = {4, 2, 10, 5, 8};
    
        CountSort countSort = new CountSort(arr);
    
        // Check initial array state
        assertArrayEquals(arr, countSort.getArray());
    
        // Check minimum and maximum values in the array
        countSort.findMinMax();
        int minVal = countSort.getMin();
        int maxVal = countSort.getMax();
        assertEquals(2, minVal);
        assertEquals(10, maxVal);
    
        // Check shift operation
        countSort.shiftArray();
        int[] shiftedArray = countSort.getArray();
        int[] expectedShiftedArray = {4 - minVal, 2 - minVal, 10 - minVal, 5 - minVal, 8 - minVal};
        assertArrayEquals(expectedShiftedArray, shiftedArray);
    
        // Check count array calculation
        countSort.calculateCountArray();
        int[] countArray = countSort.getCountArray();
        int[] expectedCountArray = {1, 0, 1, 1, 0, 0, 1, 0, 1};
        assertArrayEquals(expectedCountArray, countArray);
    
        // Check running sum calculation
        countSort.modifyCountArray();
        int[] expectedModifiedCountArray = {1, 1, 2, 3, 3, 3, 4, 4, 5};
        assertArrayEquals(expectedModifiedCountArray, countArray);
    
        // Check sorted array building
        countSort.buildSortedArray();
        int[] sortedArray = countSort.getSortedArray();
        int[] expectedSortedArray = {0, 2, 3, 6, 8};
        assertArrayEquals(expectedSortedArray, sortedArray);
    
        // Check shifting back operation
        countSort.shiftBack();
        int[] expectedShiftedBackArray = {2, 4, 5, 8, 10};
        assertArrayEquals(expectedShiftedBackArray, sortedArray);
    
        // Check final array state
        countSort.copy();
        assertArrayEquals(expectedShiftedBackArray, countSort.getArray());
    }
}
