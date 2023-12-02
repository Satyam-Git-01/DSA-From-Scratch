package DynamicProgramming;

import java.util.Arrays;

public class KnapSack01 {
    public static void main(String[] args) {
        int weight[]={1,2,3};
        int values[]={4,3,2};
        int maxweight=4;
        int dp[][]=new int[4][5];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(KnapSackRecursive(weight, values, maxweight, weight.length,dp));
    }
    //returing maxvalue
    public static int KnapSackRecursive(int weight[],int values[],int maxWeight, int index,int dp[][]){
        //base condition
        if(maxWeight==0 || index==0){
            return 0;
        }

        if(dp[index][maxWeight]!=-1){
            return dp[index][maxWeight];
        }

        //weight of item is less than maxweight and can be included or not 
        if(weight[index-1]<=maxWeight){
            //item get included
            int included = values[index-1]+ KnapSackRecursive(weight, values, maxWeight-weight[index-1], index-1,dp);
            
            //item not included
            int notincluded= KnapSackRecursive(weight, values, maxWeight, index-1,dp);

            return dp[index][maxWeight]= Math.max(included,notincluded);
        }

        //weight of item is more than maxweight to exclude item 
        return dp[index][maxWeight] =KnapSackRecursive(weight,values,maxWeight,index-1,dp);
        
    }
}
