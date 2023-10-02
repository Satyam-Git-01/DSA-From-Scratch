package BinarySearchAlgos;

public class FloorandCeilOfNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        int target=5;
        int floor=0,ceil=0;
      
        int l=0,r=arr.length-1;

        //Floor
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=target){
                floor=arr[mid];
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        //Ceil
        l=0;r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target){
                ceil=arr[mid];
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(floor +" "+ceil);
    }
}
