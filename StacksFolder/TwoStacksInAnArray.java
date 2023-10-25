package StacksFolder;

public class TwoStacksInAnArray {
    public static void main(String[] args) {
        TwoStacks stack=new TwoStacks(4);
        stack.push1(1);
        stack.push1(2);
        stack.push2(3);
        stack.push2(4);

    }
}

class TwoStacks {
    int data[];
    int top1;
    int top2;
    int size;

    public TwoStacks(int s) {
     
        this.data=new int[s];
        this.top1=-1;
        this.top2=s;
        this.size=s;

    }

    public void push1(int num) {
        if(top2-top1>1){
            this.data[++this.top1]=num;
        }
    }

    // Push in stack 2.
    public void push2(int num) {
      if(top2-top1>1){
        this.data[--this.top2]=num;
      }
    }

    // Pop from stack 1 and return popped element.
    public int pop1() {
        if(top1<=-1){
            return -1;
        }
        int item= this.data[this.top1--];
        return item;

    }

    // Pop from stack 2 and return popped element.
    public int pop2() {
        if(top2>=this.size){
            return -1;
        }
      int item=this.data[this.top2++];
      return item;
    }
}
