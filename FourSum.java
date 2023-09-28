import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        int target = 9;
        System.out.println(FourSumMethod(arr, target));
    }

    static List<List<Integer>> FourSumMethod(int arr[], int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i+1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> al = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        ans.add(al);

                        while (k < l && arr[k] == arr[k + 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l - 1]) {
                            l--;
                        }
                        k++;
                        l--;

                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
