package Recursion;

import java.util.ArrayList;

public class GenerateAllBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>();
        char arr[] = new char[n];
        // Generate(n, 0, arr, ans);
        // System.out.println(ans);

        GenerateOnlyWithoutConsecutiveOnes(n, "", ans1);
        System.out.println(ans1);
    }

    public static void Generate(int n, int index, char arr[], ArrayList<String> ans) {
        if (index == n) {

            // can use StringBuilder,StringBuffer instead of char array
            String str=String.valueOf(arr);
            for(int i=0;i<=arr.length-2;i++){
                if(arr[i]=='1' && arr[i+1]=='1'){
                    return;
                }
            }
            ans.add(str);
            return;
        }
        arr[index] = '0';
        Generate(n, index + 1, arr, ans);
        arr[index] = '1';
        Generate(n, index + 1, arr, ans);
    }

    private static void GenerateOnlyWithoutConsecutiveOnes(int n,String str, ArrayList<String> ans){
        if(str.length()==n){
            ans.add(str);
            return;
        }
        GenerateOnlyWithoutConsecutiveOnes(n, str+'0', ans);
        if(str.isEmpty() || str.charAt(str.length()-1)!='1')
        {
            GenerateOnlyWithoutConsecutiveOnes(n, str+'1', ans);
        }
    }
}
