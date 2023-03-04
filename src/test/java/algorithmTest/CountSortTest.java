package algorithmTest;

import algorithm.CountSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CountSortTest {

    @Test
    void testCountSortWhite() {
        int[] arr = {4, 2, 10, 5, 8};
    
        CountSort countSort = new CountSort(arr);
    
    
        System.out.println("Check initial array state, expected: {4, 2, 10, 5, 8}, output: " + Arrays.toString(countSort.getArray()));
        assertArrayEquals(arr, countSort.getArray());
    
        
        countSort.findMinMax();
        int minVal = countSort.getMin();
        int maxVal = countSort.getMax();
        System.out.println("Check minimum and maximum values in the array, expected: 2, 10, output: " + minVal + ", " + maxVal);
        assertEquals(2, minVal);
        assertEquals(10, maxVal);
    
        countSort.shiftArray();
        int[] shiftedArray = countSort.getArray();
        int[] expectedShiftedArray = {4 - minVal, 2 - minVal, 10 - minVal, 5 - minVal, 8 - minVal};
        System.out.println("Check shift operation, expected: {2, 0, 8, 3, 6}, output: " + Arrays.toString(shiftedArray));
        assertArrayEquals(expectedShiftedArray, shiftedArray);
    
        // Check count array calculation
        countSort.calculateCountArray();
        int[] countArray = countSort.getCountArray();
        int[] expectedCountArray = {1, 0, 1, 1, 0, 0, 1, 0, 1};
        System.out.println("Check count array calculation, expected: {1, 0, 1, 1, 0, 0, 1, 0, 1}, output: " + Arrays.toString(countArray));
        assertArrayEquals(expectedCountArray, countArray);
    
        // Check running sum calculation
        countSort.modifyCountArray();
        int[] expectedModifiedCountArray = {1, 1, 2, 3, 3, 3, 4, 4, 5};
        System.out.println("Check running sum calculation, expected: {1, 1, 2, 3, 3, 3, 4, 4, 5}, output: " + Arrays.toString(countArray));
        assertArrayEquals(expectedModifiedCountArray, countArray);
    
        // Check sorted array building
        countSort.buildSortedArray();
        int[] sortedArray = countSort.getSortedArray();
        int[] expectedSortedArray = {0, 2, 3, 6, 8};
        System.out.println("Check sorted array building, expected: {0, 2, 3, 6, 8}, output: " + Arrays.toString(sortedArray));
        assertArrayEquals(expectedSortedArray, sortedArray);
    
        // Check shifting back operation
        countSort.shiftBack();
        int[] expectedShiftedBackArray = {2, 4, 5, 8, 10};
        System.out.println("Check shifting back operation, expected: {2, 4, 5, 8, 10}, output: " + Arrays.toString(sortedArray));
        assertArrayEquals(expectedShiftedBackArray, sortedArray);
    
        // Check final array state
        countSort.copy();
        System.out.println("Check final array state, expected: {2, 4, 5, 8, 10}, output: " + Arrays.toString(countSort.getArray()));
        assertArrayEquals(expectedShiftedBackArray, countSort.getArray());
    }
}
