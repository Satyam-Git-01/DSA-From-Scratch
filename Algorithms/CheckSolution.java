public class CheckSolution {
    public static void main(String[] args) {
       // System.out.println(createAtoi("     327865201tzCiPVN.Je"));
    //    System.out.println(isPowerOfAnother((long)10,(long) 100000000));

        // int num=123456789;
        // base=(int)Math.log10(num)+1;
        // System.out.println(Rev(num));
        //String str= "bbcbaba";
        //System.out.println(str.substring(0,3));
        System.out.println(findDifferentBinaryString(new String[]{"01","10"}));
    }
    public static String findDifferentBinaryString(String[] nums) {
        String ans ="";
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int num= Integer.parseInt(nums[j],2);
                if(num==i){
                    continue;
                }else{
                    ans= Integer.toBinaryString(i);
                    return ans;
                }
            }
        }
        return ans;
    }
    static int base=0;
    static int Rev(int num){
        if(num==0){
            return 0;
        }
        int rev= (num%10)*(int)Math.pow(10,--base)+ Rev(num/10);
        return rev;
    }
    static Long isPowerOfAnother(Long X, Long Y){
        // code here
        long temp=X;
       if(X==1 || X==0){
           return (long)0;
       }
       boolean flag=true;
       while(flag){
           if(X==Y){
               return (long)1;
           }else if(X>Y){
               flag=false;
           }
           X=X*temp;
       }
       return (long)0;
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
