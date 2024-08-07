package Neetcode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode next = new ListNode(2);
        ListNode head = new ListNode(1,next);
    }
    public static class ListNode {
        int val;ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;

        ListNode prev=null;
        while(head!=null)
        {
            ListNode next_node = head.next;
            head.next = prev;
            prev=head;
            head=next_node;
        }
        return prev;
    }

}
