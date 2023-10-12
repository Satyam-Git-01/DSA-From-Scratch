import java.util.ArrayList;

public class Subsequence {
 public static void main(String[] args) {
    String str="abc";
    ArrayList<String> ans=new ArrayList<>();
    PrintSubsequence(str,0,ans,"");
 }   
 static void PrintSubsequence(String str,int index,ArrayList<String> ans,String str1){
    if(index>=str.length()){
        ans.add(str1);
        System.out.println(ans);
        return;
    }
    String temp=str1;
    str1+=str.charAt(index);
    PrintSubsequence(str, index+1, ans, str1);
    

     PrintSubsequence(str, index+1, ans, temp);
 }
}
