public abstract class SumOfAllDivisors {
    public static void main(String[] args) {

        //1 to 4 
        System.out.println(sumOfDivisors(4));
    }
    //Calculate sum of all divisors till of all number from 1 to N
    static long sumOfDivisors(int N){

        /* 1-> 1
         * 2-> 1,2
         * 3-> 1,3
         * 4-> 1,2,4
         * total sum is 15
         */
        //1 is 4 times 2 is 2 times 3 is 1 time and 4 is 1 times 
        /* 1* 4 ->4
            2* 2->4
            3*1 ->3
            4* 1->4
            sum is 15 
        */ 
    
        long ans=0;
        for(long i=1;i<=N;i++){
            ans=ans+i*(N/i);
        }
        return ans;
    }
}
