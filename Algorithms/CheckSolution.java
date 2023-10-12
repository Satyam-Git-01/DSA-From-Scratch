public class CheckSolution {
    public static void main(String[] args) {
        System.out.println(createAtoi("     327865201tzCiPVN.Je"));

    }

    public static int createAtoi(String str) {
        // Write your code here.
        str = str.trim();
        char sign = str.charAt(0);
        if (sign == '+' || sign == '-') {
            str = str.substring(1);
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else {
                break;
            }
        }
        if (sign == '-') {
            num = -1 * num;
        }
        if (num > Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE / 10) {
            return Integer.MIN_VALUE;
        }
        return num;
    }

    // static String check(String s,int index){
    // if(s.charAt(index)<1 && s.charAt(index)> )
    // }

}
