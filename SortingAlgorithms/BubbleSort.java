package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 0, 2, 1, 0 };

        // Optimised Bubble Sort
        for (int pass = 0; pass < arr.length; pass++) {
            boolean check = false;
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

        //Recursive Approach
        int arr1[] = { 5, 4, 3, 0, 2, 1, 0 };
        RecursiveBubbleSort(arr1, arr1.length, 0);

        System.out.println(Arrays.toString(arr1));

    }

    static void RecursiveBubbleSort(int arr[], int length, int pass) {
        if (pass == length) {
            return;
        }
        for (int i = 0; i < length - pass - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        RecursiveBubbleSort(arr, length, pass + 1);
    }
}
