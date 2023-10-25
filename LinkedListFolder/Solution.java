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
        // linked.insertAtIndex(5, 14);
        // // linked.deleteAtStart();
        // // linked.deleteAtLast();
        linked.display();

        linked.reverse(2, 3);

        DoubleLinkedList dd = new DoubleLinkedList();
        // dd.insertAtEnd(10);
        // dd.insertAtEnd(20);
        // dd.insertAtEnd(30);
        // dd.insertAtEnd(40);
        // dd.insertAtEnd(50);
        // dd.insertAtStart(60);
        // dd.insertAtIndex(70,3);
        // dd.displayRightToLeft();
        // System.out.println();
        // dd.displayLeftToRight();
    }
}
