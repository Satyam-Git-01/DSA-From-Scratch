package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        QUicMethod(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QUicMethod(int arr[],int low,int high){
        if(low<=high){
            int partitionIndex=Partition(arr,low,high);
            QUicMethod(arr, low, partitionIndex-1);
            QUicMethod(arr, partitionIndex+1,high);
        }
    }
    public static int Partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low; 
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=j-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;

        return j;
    }
}
