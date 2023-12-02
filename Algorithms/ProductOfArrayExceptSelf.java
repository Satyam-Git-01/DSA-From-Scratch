import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[]=new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
        System.out.println(Arrays.toString(productExceptSelfOptimal(arr, arr.length)));
    }
    //Brute Force Approach
    static int[] productExceptSelf(int arr[],int n){
        if(arr.length==0){
            return new int[]{0};
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                product*=arr[j];
            }
            ans[i]=product;
        }
        return ans;
    }

    // Most optimal Solution 
    static int [] productExceptSelfOptimal(int arr[],int n){
         if(arr.length==0){
            return new int[]{0};
        }
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        int currentValue=1;
        for(int i=0;i<n;i++){
            ans[i]*=currentValue;
            currentValue*=arr[i];
        }
        currentValue=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=currentValue;
            currentValue*=arr[i];
        }
        return ans;
    }
}
