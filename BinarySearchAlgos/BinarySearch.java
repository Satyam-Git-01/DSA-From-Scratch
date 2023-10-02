package BinarySearchAlgos;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=6;
        int ans=-1;
        //Iterative Approach
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(ans);
        System.out.println(RecursiveBinarySearch(arr, target, 0, r));
        System.out.println(RecursiveBinarySearch(arr, 100, 0, r));
    }

    //recursive Approach
    public static int RecursiveBinarySearch(int arr[],int target,int low,int high){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return RecursiveBinarySearch(arr, target, low, high-1);
            }
            else{
                return RecursiveBinarySearch(arr, target, low+1, high);
            }
        }
        return -1;
    }
}
