package DynamicProgramming;

public class SubsetWithGivenK {
    public static void main(String[] args) {
        int weight[] = { 11, 82, 91, 97, 87, 42, 80, 10, 42, 42 };
        int K = 45;
        int dp[][] = new int[weight.length + 1][K + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                }
                if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = -1;
                }
            }
        }

        System.out.println(SubsetSolve(weight, K, weight.length, dp));
    }
    // Return true or false if sum of any subset is equal to k

    static boolean SubsetSolve(int arr[], int K, int n, int dp[][]) {
        if (n == 0) {
            return false;
        }
        if (K == 0) {
            return true;
        }
        if(dp[n][K]!=-1){
            return dp[n][K]==1? true:false;
        }
        if(K>= arr[n-1]){
            boolean included= SubsetSolve(arr, K-arr[n-1], n-1, dp);
            boolean notincluded=SubsetSolve(arr, K, n-1, dp);

            dp[n][K]= included || notincluded ? 1:0;
            return included || notincluded;
        }
        return SubsetSolve(arr, K, n-1, dp);
    }

}
