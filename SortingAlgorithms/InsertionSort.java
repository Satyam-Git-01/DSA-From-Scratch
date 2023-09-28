package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 0, 2, 1, 0 };
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j = j - 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        // In Reverse Order
        int arr1[] = { 1, 2, 0, 3, 4, 5, 0 };
        for (int i = 0; i < arr1.length; i++) {
            int j = i;
            while (j > 0 && arr1[j - 1] < arr1[j]) {
                int temp = arr1[j - 1];
                arr1[j - 1] = arr1[j];
                arr1[j] = temp;
                j = j - 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
        // Recursive Method
        RecursiveInsertionSort(arr1, 0, arr.length);

        System.out.println(Arrays.toString(arr1));
    }

    // Recursive Insertion Sort
    static void RecursiveInsertionSort(int arr[], int index, int length) {
        if (index == length)
            return;
        int j = index;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        RecursiveInsertionSort(arr, index + 1, length);
    }
}
