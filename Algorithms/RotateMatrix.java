public class RotateMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][] { { 2, 4, 3 }, { 1, 0, 0 } };
        // rotateMatrix(mat);

        MatrixZero(mat);
        PrintMatrix(mat);
    }

    static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat[0].length; i++) {
            reverseArray(mat[i], 0, mat[i].length - 1);
        }

    }

    static void reverseArray(int arr[], int low, int high) {
        if (low >= high)
            return;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverseArray(arr, low + 1, high - 1);
    }

    static void MatrixZero(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    for (int k = 0; k < mat.length; k++) {
                        mat[k][j] = -1;
                    }
                    for (int k = 0; k < mat.length; k++) {
                        mat[i][k] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }

    }
}
