package BinarySearchAlgos;

public class SqrtinLogN {
    public static void main(String[] args) {
        // O(N) Soln
        int ans = 1;
        for (int i = 1; i * i <= 10; i++) {
            if (i * i <= 10) {
                ans = i;
            }
        }
        System.out.println(7 / 5);
        System.out.println(ans);

        // //Logn soln
        // System.out.println(sqrtN(7));

        System.out.println(minimumRateToEatBananas(new int[] { 7, 15, 6, 3 }, 8));
    }

    public static int sqrtN(long N) {
        long i = 1, j = N / 2;
        while (i <= j) {
            long m = i + (j - i) / 2;
            if (m * m == N) {
                return (int) m;
            } else if (m * m > N) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return (int) j;
    }

    public static int minimumRateToEatBananas(int[] arr, int h) {
        // Write Your Code Here
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        for (int i = min; i <= max; i++) {
            int hours = 0;
            for (int j = 0; j < arr.length; j++) {
                int cal = (int) Math.ceil((double) (arr[j] / (double) i));
                hours = hours + cal;
            }
            if (hours == h) {
                return i;
            }
        }
        return ans;
    }
}
