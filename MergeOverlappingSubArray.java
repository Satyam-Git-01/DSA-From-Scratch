import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingSubArray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            List<Integer> check = new ArrayList<>();
            if (arr[i][0] <= arr[i - 1][1]) {
                int a = arr[i - 1][0];
                int b = arr[i][1];
                check.add(a);
                check.add(b);
                ans.add(check);
            }
            else{
                int a=arr[i][0];
            int b=arr[i][1];
            check.add(a);
            check.add(b);
            ans.add(check);
            }
        }
        System.out.println(ans);
    }
}
