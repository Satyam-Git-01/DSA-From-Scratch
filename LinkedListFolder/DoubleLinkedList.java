package LinkedListFolder;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;
    DoubleLinkedList(){
        this.size=0;
    }
    private static class Node{
        int data;
        Node previous;
        Node next;
        Node(){
            this.data=0;
            this.previous=null;
            this.next=null;
        }
        Node (int data){
            this.data=data;
             this.previous=null;
            this.next=null;
        }
    }

    public void insertAtEnd(int data){
        if(this.head==null){
            Node n=new Node(data);
            this.head=n;
            this.tail=n;
            return;
        }
        Node n=new Node(data);
        n.previous=tail;
        tail.next=n;
        tail=n;
        
    }
    public void displayLeftToRight(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void displayRightToLeft(){
        Node temp=this.tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.previous;
        }
    }
    public void insertAtStart(int data){
        Node n=new Node(data);
        if(this.head==null){
            this.head=n;
            this.tail=n;
            return;
        }
        this.head.previous=n;
        n.next=this.head;
        this.head=n;
    }
    public void insertAtIndex(int data,int index){
        Node n=new Node(data);
        if(index==0){
            insertAtStart(data);
            return;
        }
        else if(index==this.size){
            insertAtEnd(data);
            return;
        }
        Node temp=head;
        while(index!=1){
            temp=temp.next;
            index--;
        }
        n.previous=temp;
        n.next=temp.next;
        temp.next=n;
    }
}
