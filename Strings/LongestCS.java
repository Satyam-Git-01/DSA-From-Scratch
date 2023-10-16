package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestCS {

    public static void main(String[] args) {

        //Brute Force Approach
        System.out.println(lcs("def", "edf"));
        //Efficient way is to use DP
    }

	public static int lcs(String s, String t) {
		//Your code goes here
		ArrayList<String> SubsofS=new ArrayList<String>();
		ArrayList<String> Subsoft=new ArrayList<String>();
		Subsequences(s,0,"",SubsofS);
		Subsequences(t,0,"",Subsoft);
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<SubsofS.size();i++){
			map.put(SubsofS.get(i),map.getOrDefault(SubsofS.get(i), 0)+1);
		}
		int maxLen=0;
		for(int i=0;i<Subsoft.size();i++){
			if(map.containsKey(Subsoft.get(i))){
				maxLen=Math.max(maxLen,Subsoft.get(i).length());
			}
		}
		return maxLen;
    }

	public static void Subsequences(String str,int index,String ans,ArrayList<String> arr){
		if(index==str.length()){
			arr.add(ans);
			return;
		}
		Subsequences(str,index+1,ans+str.charAt(index),arr);
		Subsequences(str,index+1,ans,arr);
	}

}