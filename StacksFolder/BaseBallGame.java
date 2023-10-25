package StacksFolder;

import java.util.*;

public class BaseBallGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
    public static  int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<ops.length;i++){
            String  c=ops[i];
            if(c=="C"){
                    stack.pop();
            }else if(c=="D"){
                int n= 2* stack.peek();
                stack.push(n);
            }
            else if(c=="+"){
                int t1=stack.pop();
                int t2=stack.pop();
                int l=t1+t2;
                stack.push(t2);
                stack.push(t1);
                stack.push(l);
            }
            else {
                int s=Integer.parseInt(c);
                stack.push(s);
            }
        }
        for(int i=0;i<stack.size();i++){
            ans=ans+ stack.elementAt(i);
        }
        return ans;
        
    }
}
