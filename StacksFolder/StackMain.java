package StacksFolder;

public class StackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(65);
        stack.push(12);
        stack.push(89);
        stack.push(5);
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // stack.pop();
        //stack.display();
    }
}
