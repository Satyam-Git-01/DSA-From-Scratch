import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArrayWIthXORk {
    public static void main(String[] args) {
        int arr[] = { 4,2,2,6,4 };
        int target = 6;
        List<List<Integer>> ans = new ArrayList<>();
        // BruteForece
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int xor = 0;
                List<Integer> ans1 = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    xor = xor ^ arr[k];
                    ans1.add(arr[k]);
                }
                if (xor == target) {
                    ans.add(ans1);
                }
            }
        }
        System.out.println(ans);
        System.out.println(ans.size());

        System.out.println(XORCount(arr, target));
    }

    //Optimal Approach
    static int XORCount(int arr[],int k){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        int count=0;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];

            int x= xor^k;

            if(map.containsKey(x)){
                count+=map.get(x);
            }

            if(map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }
            else{
                map.put(xor,1);
            }
        }
        return count;
    }
}
