package QueuesFolder;

public class CustomQueue {
    int data[];
    int front;
    int rear;
    CustomQueue(){
        this(10);
        this.front=0;
        this.rear=0;
    }
    CustomQueue(int size){
        this.data=new int[size];
    }
}
