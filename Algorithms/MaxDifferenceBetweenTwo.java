public class MaxDifferenceBetweenTwo {
    public static void main(String[] args) {
        int arr[] = { 6, 1, 5, 7, 9, 16 };
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, Math.abs(arr[i] - arr[i - 1]));
        }
        // System.out.println(max);

        int mat[][] = {
                { 5, 4, -2, 5 },
                { 0, 2, 3, 4 },
                { 3, 2, 1, 5 },
                { 3, 4, 1, 4 } };

        //System.out.println(MaxMatrixDiff(mat));
        System.out.println(Optimal(mat,mat.length));
    }

    static int MaxMatrixDiff(int mat[][]) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                int a = mat[row][col];
                int checkRow = row + 1;
                int checkCol = col + 1;
                while (checkRow < mat.length && checkCol < mat[0].length) {
                    int b = mat[checkRow][checkCol];
                    max = Math.max(max, b - a);
                    if (checkCol == mat[0].length - 1) {
                        checkRow++;
                        checkCol = col;
                    }

                    checkCol++;
                }

            }
        }
        return max;
        //
    }

    static int Optimal(int A[][], int N) {
        int R = Integer.MIN_VALUE, x;
        for (int i = 1; i < N; i++) {
            A[0][i] = Math.min(A[0][i], A[0][i - 1]);
            A[i][0] = Math.min(A[i][0], A[i - 1][0]);
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                x = A[i][j];
                A[i][j] = Math.min(x, Math.min(A[i - 1][j], A[i][j - 1]));
                R = Math.max(R, x - A[i - 1][j - 1]);
            }
        }

        return R;
    }
}
