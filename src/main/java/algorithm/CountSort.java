package algorithm;

public class CountSort {
    private int[] array;

    public CountSort(int[] values) {
        array = values.clone();
    }

    public static void countSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        // Find the minimum and maximum values in the array
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            } else if (num > maxVal) {
                maxVal = num;
            }
        }

        // Shift all the values so that the minimum value becomes zero
        int shift = -minVal;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += shift;
        }

        // Count the occurrences of each value
        int[] count = new int[maxVal + shift + 1];
        for (int num : arr) {
            count[num]++;
        }

        // Modify the count array to store the running sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        int[] sortedArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            int index = count[num] - 1;
            sortedArr[index] = num;
            count[num]--;
        }

        // Shift all the values back to their original range
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] -= shift;
        }

        // Copy the sorted array back to the input array
        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }
}
