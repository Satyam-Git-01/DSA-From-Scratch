package BinarySearchAlgos;

public class UpperBound {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,5,6,7,8};
        int target=5;
        int ans=arr.length;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target){
                ans=mid;
                r=mid-1;
            }
            else{
               l=mid+1;
            }
        }
        System.out.println(ans);
    }
}
