package StacksFolder;

public class StacksUsingLL {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(4);
        st.pop();
        System.out.println(st.getTop());
    }

    static class Node {
        int data;
        Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    };

    static class Stack {
        // Write your code here
        Node head;
        Node tail;
        int size;

        Stack() {
            // Write your code here
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        int getSize() {
            // Write your code here
            return this.size;
        }

        boolean isEmpty() {
            // Write your code here
            return this.size == 0 ? true : false;
        }

        void push(int data) {
            // Write your code here
            Node n = new Node(data);
            if (this.head == null) {
                this.head = n;
                this.tail = n;
            } else {
                this.tail.next = n;
                this.tail = n;
            }
            this.size++;
        }

        void pop() {
            // Write your code here
            if (this.head == null && this.tail == null) {
                return;
            }
            Node t = this.head;
            Node pr = this.head;
            while (t != null && t.next != null) {
                pr = t;
                t = t.next;
            }

            this.tail = pr;
            pr.next = null;
            this.size--;
        }

        int getTop() {
            if (size == 0) {
                return -1;
            }
            // Write your code here
            return this.tail.data;
        }
    }
}
