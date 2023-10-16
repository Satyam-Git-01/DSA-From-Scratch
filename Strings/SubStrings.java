package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubStrings {
    public static void main(String[] args) {
        String str="abcd";
        String str2="bcd";
        ArrayList<String> subs1= GenerateSubstring(str);
        ArrayList<String> subs2= GenerateSubstring(str2);
        System.out.println(subs1);
        System.out.println(subs2);
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<subs1.size();i++){
            map.put(subs1.get(i), map.getOrDefault(subs1.get(i),0)+1);
        }
        int maxLen=0;
        for(int i=0;i<subs2.size();i++){
           if(map.containsKey(subs2.get(i))){
            maxLen=Math.max(maxLen, subs2.get(i).length());
           }
        }
        System.out.println(maxLen);
    }
    public static ArrayList<String> GenerateSubstring(String str){
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<str.length();i++){
          for(int j=i;j<str.length();j++){
           ans.add(str.substring(i,j+1));
          }
        }
        return ans;
    }
}
