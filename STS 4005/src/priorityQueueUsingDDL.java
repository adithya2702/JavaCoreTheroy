import java.util.*;

class Node{
    int data;
    int priority;
    Node next;
    Node prev;
    Node(int n, int pri){
        data = n;
        priority = pri;
        next = null;
        prev = null;
    }
}
class priorityQueueUsingDDL{


    static Node front = null;
    static Node rear = null;
    static void insert(int n, int pri){
        Node newnode = new Node(n,pri);
        if(front == null){
            front = newnode;
            rear = newnode;
        }
        else{
            if(pri < front.priority){
                newnode.next = front;
                front.prev = newnode;
                front = newnode;
            }
            else{
                Node curr = front;
                while(curr.next != null && curr.next.priority < pri){
                    curr = curr.next;
                }
                if(curr.next == null){
                    curr.next = newnode;
                    newnode.prev = curr;
                    rear = newnode;
                }
                else{
                    newnode.next = curr.next;
                    newnode.prev = curr;
                    curr.next.prev = newnode;
                    curr.next = newnode;
                }
            }
        }
    }
    static void display(){
        Node curr = front;
        while(curr != null){
            System.out.println(curr.data + " " + curr.priority);
            curr = curr.next;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the value and their priority");
        for(int i=0;i<n;i++){
            int c = sc.nextInt();   //data
            int d = sc.nextInt();   //priority
            insert(c,d);
        }
        System.out.println("Priority Queue :");
        display();
    }
}