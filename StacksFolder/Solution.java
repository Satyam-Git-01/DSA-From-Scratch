package StacksFolder;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        // System.out.println(removeOuterParentheses("((()())(()()))"));
        System.out.println(isValid("(])"));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String sb = "";
        for (int i = 0; i < s.length();) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
                i++;
            } else if (!st.isEmpty() && c == ')' && st.peek() == '(' && st.size() == 1) {
                st.pop();
                i++;
            } else if (c == ')') {
                String close = "";
                String open = "";
                int count = 0;
                while (st.size() != 1) {
                    open = open + st.pop();
                    // i++;
                    close = close + ')';
                    count++;
                }
                sb = sb + open + close;
                if (count == 0) {
                    i++;
                } else {
                    i = i + count;
                }
            }

        }
        return sb;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}