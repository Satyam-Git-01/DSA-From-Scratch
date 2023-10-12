import java.util.ArrayList;

public class GenerateAllSubArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> t = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    t.add(arr[k]);
                }
                if (!t.isEmpty()) {
                    ans.add(t);
                }
            }
        }
        System.out.println(ans);
    }
}
