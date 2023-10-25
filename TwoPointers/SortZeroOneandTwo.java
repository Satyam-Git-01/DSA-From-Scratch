package TwoPointers;
import java.util.Arrays;
public class SortZeroOneandTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort0s1s2s(new int[] { 1, 2, 0, 1 })));
    }

    public static int[] Sort0s1s2s(int[] arr) {
        // Write your code here.
        int i = 0;
        int l = 0;
        int k = arr.length - 1;
        while (i < arr.length && i<=k) {
            if (arr[i] == 0) {
                int t = arr[i];
                arr[i] = arr[l];
                arr[l] = t;
                l++;

            } else if (arr[i] == 2) {
                int t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
                k--;
            }
            i++;
        }
        return arr;
    }
}
