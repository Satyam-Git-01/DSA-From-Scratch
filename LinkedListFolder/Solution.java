package LinkedListFolder;

public class Solution {
    public static void main(String[] args) {
        LL linked = new LL();
        linked.insertAtStart(2);
        linked.insertAtStart(1);
        linked.insertAtStart(3);
        linked.insertAtStart(4);
        linked.insertAtEnd(10);
        linked.insertAtEnd(11);
        linked.insertAtIndex(5, 14);
        // linked.deleteAtStart();
        // linked.deleteAtLast();
        linked.deleteAtIndex(7);

        linked.display();
       
    }
}
