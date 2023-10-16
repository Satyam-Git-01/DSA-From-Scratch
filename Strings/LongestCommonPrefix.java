package Strings;
public class LongestCommonPrefix{
    public static void main(String[] args) {
        String arr[]={
            "xwRcaCqm",
            "xwRczjCNn",
            "xwRcuqXv",
            "xwRcwXijygyu",
            "xwRccuGdI",
            "xwRc"
            };
        System.out.println(commonPrefix(arr, arr.length));
    }
    public static String commonPrefix(String []arr,int n){
        String prefix=arr[0];
        for(int i=1;i<n;i++){
            int j=prefix.length();
            while(j>=0){
                if(arr[i].indexOf(prefix)!=0){
                    prefix=prefix.substring(0,j);
                }else{
                    break;
                }
                j--;
            }
        }
        if(prefix.length()!=0){
            return prefix;
        }
        return "-1";
    }
}