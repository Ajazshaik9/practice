package DataStructures;

import Nodes.ListNode;

public class LL {
    Node head;
    class Node
    {
        String data;
        Node next;
        public Node() {}
        public Node(String data) {this.data = data;}
        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("LinkedList");
        list.print();

    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void print()
    {
        if (head==null) return;
        Node curr = head;
        while (curr!=null)
        {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
