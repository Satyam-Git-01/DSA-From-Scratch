import java.util.Arrays;

public class Base58 {
    public static void main(String[] args) {
        char store[] = new char[59];
        int count=0;

        for (int i = 0; i <= 60; i++) {
            if (i < 9) {
                store[count++] = (char) ((i + 49));
            } else if (i == 17 || i==23|| i==46) {
                continue;
            } else if (i >= 9 && i < 35) {
                store[count++] = (char) (i + 56);
            } else {
                store[count++] = (char) (i + 62);
            }
        }
        System.out.println(Arrays.toString(store));
        int n = 4364;
        String ans = "";
        while (n != 0) {
            int d = n / 58;
            int rem = n % 58;
            // System.out.println(rem);
            ans = store[rem] + ans;
            n = d;
        }
        System.out.println(ans);
    }

}
