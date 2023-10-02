package SortingAlgorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,3,3,3};
        int arr1[]={3,1,2,5,3};
        Cycle(arr);
        Cycle(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    static void Cycle(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
}
