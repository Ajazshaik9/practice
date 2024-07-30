package Nodes;

public class ListNode<T> {
    T data;
    ListNode next;

    public ListNode() {}

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode(T data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
