package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        //Using Mininmun Index Apprroach in Increaseing Order
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // In ReverseOrder
        int arr1[]={1,2,3,4,5};
         for (int i = 0; i < arr1.length; i++) {
            int max_index = i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[j] > arr1[max_index]) {
                    max_index = j;
                }
            }
            int temp = arr1[max_index];
            arr1[max_index] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
