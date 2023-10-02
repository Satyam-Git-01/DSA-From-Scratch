import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 4, 8, 10};
        int [] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        //System.out.println(Arrays.toString(MergeArrays(arr1, arr2, n, m)));

        MergeOptimal(arr1, arr2, n, m);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
       
    }

    //Brute Force use and Extra Space
    static int [] MergeArrays(int arr1[],int arr2[],int n,int m){
        int ans[]=new int[m+n];
        int first=0;
        int second=0;
        int ansPointer=0;
        while(first< n && second<m){
            if(arr1[first]<arr2[second]){
                ans[ansPointer]=arr1[first];
                first++;
                ansPointer++;
            }
            else{
                ans[ansPointer]=arr2[second];
                second++;
                ansPointer++;
            }
        }
        while(first<n){
            ans[ansPointer]=arr1[first];
            ansPointer++;
            first++;
        }
        while(second<m){
            ans[ansPointer]=arr2[second];
            ansPointer++;
            second++;
        }
        return ans;
    }

    //Optimal Withou using EXtra Space Returning first n in arr1 and last m in arr2
    public static void MergeOptimal(int arr1[],int arr2[],int n,int m){
        int left=n-1; //Pointing to end of a1
        int right=0; // pointing to start of a2

        while(left >=0 && right <m){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
