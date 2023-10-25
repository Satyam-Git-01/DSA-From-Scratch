package StacksFolder;
import java.util.*;
public class Check {
    
    static class Stack {
        // Define the data members.
        
        Queue<Integer> queue1;
        Queue<Integer> queue2;
        public Stack() {
            // Implement the Constructor.
            queue1= new LinkedList<Integer>();
            queue2= new LinkedList<Integer>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            // Implement the getSize() function.
            return queue1.size();
        }

        public boolean isEmpty() {
            // Implement the isEmpty() function.
            return queue1.isEmpty();
        }

        public void push(int element) {
            // Implement the add(element) function.
            queue1.add(element);
        }

        public int pop() {
            if(queue1.isEmpty()){
                return -1;
            }
            // Implement the pop() function.
            int q1=queue1.size()-1;
            for(int i=0;i<q1;i++){
                queue2.add(queue1.poll());
            }
            int item=queue1.poll();
            for(int i=0;i<q1;i++){
                queue1.add(queue2.poll());
            }
            return item;
        }

        public int top() {
            if(queue1.isEmpty()){
                return -1;
            }
            // Implement the top() function.
            for(int i=0;i<queue1.size()-1;i++){
                queue2.add(queue1.poll());
            }
            int item=queue1.poll();
            for(int i=0;i<queue2.size();i++){
                queue1.add(queue2.poll());
            }
            queue1.add(item);
            return item;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.getSize());
        st.push(13);
        System.out.println( st.pop());
        st.push(42);
        System.out.println( st.top());
        //st.push(4);
        System.out.println(st.isEmpty());
        // st.push(17);
        // st.push(23);
        // st.push(11);
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
    }
        public String removeOuterParentheses(String s) {
            java.util.Stack<Character> st=new java.util.Stack<>();
            String sb="";
            for(int i=0;i<s.length();){
                char c=s.charAt(i);
                if(c=='('){
                    st.push(c);
                    i++;
                }
                else if(c==')'){
                    String close="";
                    String open="";
                    while(st.size()!=1){
                       open=open+st.pop();
                        i++;
                        close=close+')';
                    }
                    sb=sb+open+close;
                }
            }
            return sb;
        }

}