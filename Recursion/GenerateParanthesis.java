package Recursion;

import java.util.ArrayList;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n=2;
        int open=n;
        int close=n;
        ArrayList<String> ans = new ArrayList<>();
        Generate(n,"",open,close,ans);
        System.out.println(ans);
    }
    public static void Generate(int n,String str,int open,int close, ArrayList<String> ans){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        if(open>0){
            Generate(n,str+'(',open-1,close,ans);
        }
        if(close>open){
            Generate(n,str+')',open,close-1,ans);
        }
    }
}
