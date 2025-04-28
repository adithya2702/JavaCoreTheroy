import java.util.Scanner;
public class oddEvenLL {
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
    static node OddEven(){
        node odd = head;
        node even = head.next;
        node temp=even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=temp;
        return head;
    }
    static void display(){
        node temp = head;
        if(head != null){
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            append(sc.nextInt());
        }
    OddEven();
    display();
    }
}
