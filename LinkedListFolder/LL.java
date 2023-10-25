package LinkedListFolder;

public class LL {
    Node head;
    Node tail;
    int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    LL() {
        this.size = 0;
    }

    public void insertAtStart(int value) {
        Node node = new Node(value);
        node.next = this.head;
        head = node;
        if (this.tail == null) {
            this.tail = head;
        }
        this.size++;
    }

    public void insertAtEnd(int value) {
        if (this.tail == null) {
            insertAtStart(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        try {
            if (index > this.size) {
                throw new Exception("Index is more than size");
            }
            Node node = new Node(data);
            Node temp = this.head;
            while (index != 1) {
                temp = temp.next;
                index--;
            }
            node.next = temp.next;
            temp.next = node;
            this.size++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void deleteAtStart() {
        this.head = this.head.next;
        this.size--;
    }

    public void deleteAtLast() {
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        this.size--;
    }

    public void deleteAtIndex(int index) {
        if (index > this.size) {
            throw new Error("Index is Invalid");
        }
        if (index == 0) {
            this.deleteAtStart();
        } else if (index == this.size - 1) {
            this.deleteAtLast();
        } else {
            Node temp = this.head;
            int i = 1;
            while (i < index) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            this.size--;
        }
    }

    public void reverse(int low, int high) {
        Node temp = this.head;
        Node start = null;
        Node end = null;
        int count = 1;
        Node prevOfStart = null;
        Node nextOfEnd = null;
        while (count <= high) {

            if (count <= low) {
                prevOfStart = start;
                start = temp;
            }
            end = temp;
            nextOfEnd = temp.next;
            count++;
            temp = temp.next;
        }
        Node pre = prevOfStart;
        Node cur = start;
        Node t = null;
        while (cur != nextOfEnd) {
            t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }

        prevOfStart.next = pre;
        pre.next = nextOfEnd;

        display();
    }
}
