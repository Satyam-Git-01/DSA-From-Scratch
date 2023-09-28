package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={2,-2,0,1,1};
        System.out.println(ThreeSumMethod(arr, arr.length));
    }
    static List<List<Integer>> ThreeSumMethod(int arr[],int n){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            while(j<k){
                int sum= arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> al=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(al);

                    while(j<k && arr[j]==arr[j+1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                    
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}
