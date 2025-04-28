import java.util.Scanner;
class node {
    int data;
    node next;
    node(int n) {
        this.data = n;
        this.next = null;
    }
}
public class appendLL{
    static node head = null;
    static node append(int n){
        node newnode = new node(n);
        if(head == null){
            head = newnode;
        }
        else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        return head;
    }
    static void display(){
        node temp = head;
        if(head != null){
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    static void reverse(){
        node cur = head;
        node nnext = null;
        node prev = null;
        while(cur != null){
            nnext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nnext;
        }
        head = prev;
    }
    static node addMiddle(int n, int pos){
        node newNode= new node(n);
        if(pos==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            node temp=head;
            int index=0;
            while(temp!=null && index<pos-1){
                temp=temp.next;
                index++;
            }
            if (temp == null) {
                return head;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            n= sc.nextInt();
            if(n==-1){
                break;
            }
            append(n);
        }
        display();
        int val=sc.nextInt();
        int pos = sc.nextInt();
        addMiddle(val,pos);
        //reverse();
        display();
    }
}