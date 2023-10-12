public class nCr {
    public static void main(String[] args) {
        // int n = 4;
        // int r = 0;
        // int res = 1;
        // for (int i = 0; i < r; i++) {
        // res = res * (n - i);
        // res = res / (i + 1);
        // }
        // System.out.println(res);

        // Print whole nth Row
        // int n = 4;
        // int r = 4;
        // int res = 1;
        // System.out.print(res+" ");
        // for (int i = 0; i < r; i++) {
        // res = res * (n - i);
        // res = res / (i + 1);
        // System.out.print(res+" ");
        // }

        // Print Pascal Traingle till nth row
        int x = 4; // till x row
        for (int l = 0; l < x; l++) {
            int res = 1;
            System.out.print(res + " ");
            for (int i = 0; i < l; i++) {
                res = res * (l - i);
                res = res / (i + 1);
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
