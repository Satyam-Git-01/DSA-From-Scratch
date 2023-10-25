package StacksFolder;
public class CustomStack {
    int data[];
    int top=-1;
    CustomStack(){
        this.data=new int[10];
    }
    CustomStack(int size){
        this.data=new int[size];
    }

    public void push(int item){
        if(this.top>this.data.length-1){
            throw new Error("Stack is full");
        }
        this.data[++top]=item;
    }
    public int pop() throws CustomStackException{
        if(this.top==-1){
            throw new CustomStackException("This is a exception");
        }
        int item= this.data[this.top];
        this.data[this.top]=0;
        this.top--;
        return item;
    }
    public void display(){
        if(this.top==-1){
            throw new Error("Nothing to show");
        }
        int count=this.top;
        while(count!=-1){
            System.out.print(this.data[count]+"->");
            count--;
        }
    }
}
