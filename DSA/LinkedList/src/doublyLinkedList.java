import java.util.Scanner;

class Dnode {
    int data;
    Dnode prev;
    Dnode next;

    Dnode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class doublyLinkedList {
    private Dnode head;
    private Dnode tail;

    public doublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertFront(int data) {
        Dnode newNode = new Dnode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertRear(int data) {
        Dnode newNode = new Dnode(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertMiddle(int pos, int data) {
        if (pos <= 0) {
            insertFront(data);
            return;
        }
        Dnode newNode = new Dnode(data);
        Dnode temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            insertRear(data);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void deleteFront() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteRear() {
        if (tail == null) {
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteMiddle(int pos) {
        if (head == null || pos <= 0) {
            return;
        }
        if (pos == 1) {
            deleteFront();
            return;
        }
        Dnode temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void display() {
        Dnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList list = new doublyLinkedList();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.insertRear(ele);
        }
        list.display();

        System.out.println("Enter the position at which the element should be inserted: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert in front");
        int ele = sc.nextInt();
        list.insertMiddle(pos, ele);
        list.display();

        System.out.println("Deleting front element...");
        list.deleteFront();
        list.display();

        System.out.println("Deleting rear element...");
        list.deleteRear();
        list.display();

        System.out.println("Enter the position of the element to delete from the middle: ");
    }
}
