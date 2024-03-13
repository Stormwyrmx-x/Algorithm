package org.example.sort;

/**
 * This class provides methods to perform Merge Sort on an array of integers.
 */
public class MergeSort
{
    /**
     * This method sorts an array of integers using the Merge Sort algorithm.
     * It recursively divides the array into two halves until it can no more be divided,
     * then it merges them in a way that they become sorted.
     *
     * @param array The array to be sorted.
     * @param left The starting index of the array to be sorted.
     * @param right The ending index of the array to be sorted.
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;

        int mid = (left+right)>>1; // (left + right) / 2

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    /**
     * This method merges two halves of an array in a way that they become sorted.
     *
     * @param arr The array with two halves to be merged.
     * @param left The starting index of the first half.
     * @param mid The ending index of the first half.
     * @param right The ending index of the second half.
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // middle array

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
        // also can use System.arraycopy(a, start1, b, start2, length)
    }

    /**
     * The main method which tests the mergeSort method with an array of integers.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args)
    {
        int[] array = { 5, 4, 3, 2, 1 };
        mergeSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}