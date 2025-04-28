import java.util.Scanner;
public class palindromeLL {
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
    static node reverse(node head){
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
        return head;
    }
    static boolean Palindrome(){
        node fast = head;
        node slow = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node h1= reverse(slow);
        node temp = head;
        while(h1 != null){
            if(temp.data != h1.data){
                System.out.println("No");
                return false;
            }
            h1= h1.next;
            temp= temp.next;
        }
        System.out.println("Yes");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            append(sc.nextInt());
        }
        Palindrome();
    }
}