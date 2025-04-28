public class reorderList {
    public static void main(String[] args) {

    }
    static void reorder(Node head){
        Node head1=head;
        Node mid=mid(head);
        Node head2=reverse(mid);
        Node temp=head1;
        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
    }
    static Node reverse(Node head){
        Node prev=null;
        Node curr = head;
        Node next=curr.next;
        while(curr!=null && curr.next!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
