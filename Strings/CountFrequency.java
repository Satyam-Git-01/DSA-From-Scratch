package Strings;

public class CountFrequency {
    public static void main(String[] args) {
        String str="aaabbccdddde";
        int count=1;
        char f=str.charAt(0);
        String num1="";
        for(int i=1;i<str.length();i++){
            char g=str.charAt(i);
            if(g==f){
                count++;
            }
            else{
                num1=num1+count;
              //  System.out.println(count);
                f=g;
                count=1;
            }
            if(i==str.length()-1){
                num1=num1+count;
               // System.out.println(count);
            }
        }
        System.out.println(num1);
    }
}
