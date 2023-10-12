import java.util.HashMap;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
         int arr[]={-5, 8, -14, 2, 4, 12};
        //int arr[] = { 1, -1, 1, 1,0, 1, -1, 1, -1, -1, -1 ,0,0};
        boolean check=false;
        int k = -1;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
                check=true;
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
                check=true;
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        System.out.println(maxLen);
        if(check){
            System.out.println("found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}