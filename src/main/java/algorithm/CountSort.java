package algorithm;

public class CountSort {
    private int[] array;
    private int minVal;
    private int maxVal;
    private int[] countArray;
    private int[] sortedArray;

    public CountSort(int[] values) {
        array = values.clone();
    }

    public  void countSort() {
        if (array.length == 0) {
            return;
        }

        // Find min and max values in the array
        findMinMax();

        // Shift all the values so that the minimum value becomes zero
        shiftArray();

        // Count the occurrences of each value
        calculateCountArray();

        // Modify the count array to store the running sum
        modifyCountArray();

        // Build the sorted array
        buildSortedArray();

        // Shift all the values back to their original range
        shiftBack();

        // Copy the sorted array back to the input array
        copy();
    }

    public void findMinMax() {
        minVal = array[0];
        maxVal = array[0];
        for (int num : array) {
            if (num < minVal) {
                minVal = num;
            } else if (num > maxVal) {
                maxVal = num;
            }
        }
    }

    public void shiftArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - minVal;
        }
    }

    public void calculateCountArray() {
        countArray = new int[maxVal - minVal + 1];
        for (int num : array) {
            countArray[num]++;
        }
    }

    public void modifyCountArray() {
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
    }

    public void buildSortedArray() {
        sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            int index = countArray[num] - 1;
            sortedArray[index] = num;
            countArray[num]--;
        }
    }

    public void shiftBack() {
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] += minVal;
        }
    }

    public void copy() {
        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    public int[] getArray() {
        return array;
    }

    public int getMin() {
        return minVal;
    }

    public int getMax() {
        return maxVal;
    }

    public int[] getCountArray() {
        return countArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }
}
