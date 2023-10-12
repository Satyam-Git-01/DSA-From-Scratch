package BinarySearchAlgos;

public class NthRootOfNum {
    public static void main(String[] args) {
        int N = 3;
        int M = 8;
        int ans = 1;
        for (int i = 1; i * i< M ; i++) {
            int pr = 1;
            for (int j = 1; j <= N; j++) {
                pr = pr * i;
            }
            if (pr == M) {
                ans = i;
                break;
            } else {
                ans = -1;
            }
        }
        System.out.println(ans);
        System.out.println(NthRoot(9 ,1953125));
        System.out.println(Math.pow(5,9));
    }
    //Optimized Soln
    public static int NthRoot(int N,int M){
        int ans=-1;
        int low=1;
        int high=M;

        while(low<=high){
            int mid=low+(high-low)/2;
            int val=(int)Math.pow(mid,N);

        //35000

            if(val==M){
                ans=mid;
                break;
            }
            else if(val>M){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
