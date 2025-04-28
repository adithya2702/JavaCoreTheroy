import java.sql.PseudoColumnUsage;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(){

    }
}
class linkedList{
    static Node head = null;
    public static Node insertFront(int ele){
        Node newnode = new Node(ele);
        newnode.next = null;
        if(head==null){
            head= newnode;
        }
        else{
            newnode.next=head;
            head= newnode;
        }
        return head;
    }
    public static void insertMiddle(int pos, int ele){
        Node newnode = new Node(ele);
        if(pos==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void insertRear(int ele){
        Node newnode = new Node(ele);
        newnode.next=null;
        if(head==null){
            head = newnode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public static void deleteFront(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public static void deleteMiddle(int pos){
        if(head==null || pos<0){
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            if(temp.next==null){
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    public static void deleteRear(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void insertRec(int value,int index,Node temp){
        if (index == 0) {
            Node newnode = new Node(value);
            newnode.next = head;
            head = newnode;
            return;
        }
        if(index==1){
            Node newnode = new Node(value);
            newnode.next=temp.next;
            temp.next=newnode;
            return;
        }
        if(temp== null || temp.next==null ){
            return;
        }
        insertRec(value,index-1,temp.next);
    }
    public Node sortList(Node head) {
        if(head==null || head.next== null){
            return head;
        }
        Node mid=getMid(head);
        Node left = sortList(head);
        Node  right = sortList(mid);
        return merge(left,right);
    }
    public Node getMid(Node head){
        Node slow = head;
        Node fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid=slow.next;
        slow.next=null;
        return mid;
    }
    public Node merge(Node head1,Node head2){
        Node head3 = new Node();
        Node temp=head3;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        if(head1!=null) temp.next=head1;
        else temp.next=head2;
        head3=head3.next;
        return head3;
    }
    public boolean isLoop(Node head){
        if(head==null) return false;
        Node slow= head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public Node loopStart(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node temp=head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
    public static Node reverseRec(Node head){
        if(head==null|| head.next==null) return head;
        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null) {
                next = next.next;
            }
        }
        head=prev;
        return head;
    }
    public static int size(Node head){
        if(head==null) return 0;
        Node temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            ++size;
        }
        return size;
    }
    public static Node reverseBetween(Node head,int left,int right){
        if(left== right) return head;
        Node curr=head;
        Node prev=null;
        for(int i=0;i<left && curr!=null;i++){
            prev=curr;
            curr=curr.next;
        }
        Node last=prev;
        Node newEnd = curr;
        Node next=curr.next;
        for(int i=0;i<right-left+1 && curr!=null; i++){
            curr.next=prev;
            curr=next;
            if(next!=null)
                next= next.next;
        }
        if(last!=null) last.next=prev;
        else head=prev;
        newEnd.next=curr;
        return head;
    }
    public static Node reverseKele(Node head,int k){
        if(k<=1 || head==null) return head;
        Node curr=head;
        Node prev=null;
        while(size(prev)>=k) {
            Node last = prev;
            Node newEnd = curr;
            Node next = curr.next;
            for (int i = 0; i < k && curr != null; i++) {
                curr.next = prev;
                curr = next;
                if (next != null)
                    next = next.next;
            }
            if (last != null) last.next = prev;
            else head = prev;
            newEnd.next = curr;
            if(curr==null){
                break;
            }
            prev=newEnd;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            linkedList.insertRear(ele);
        }
        System.out.println("Enter the position at which the element should be inserted: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert in front");
        int ele =sc.nextInt();
        //linkedList.insertFront(ele);
        linkedList.insertMiddle(pos,ele);
        linkedList.display();
    }
}
