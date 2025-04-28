import java.util.Scanner;

class Cnode {
    int data;
    Cnode next;

    Cnode(int data) {
        this.data = data;
        this.next = null;
    }
}

class circularLinkedList {
    private Cnode head;

    public circularLinkedList() {
        head = null;
    }

    public void insertFront(int data) {
        Cnode newNode = new Cnode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Cnode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertRear(int data) {
        Cnode newNode = new Cnode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Cnode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void insertMiddle(int pos, int data) {
        if (pos <= 0) {
            insertFront(data);
            return;
        }
        Cnode newNode = new Cnode(data);
        Cnode temp = head;
        for (int i = 1; temp.next != head && i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFront() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Cnode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    public void deleteRear() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Cnode temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    public void deleteMiddle(int pos) {
        if (head == null || pos <= 0) {
            return;
        }
        if (pos == 1) {
            deleteFront();
            return;
        }
        Cnode temp = head;
        for (int i = 1; temp.next != head && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            return;
        }
        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Cnode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularLinkedList list = new circularLinkedList();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.insertRear(ele);
        }
        list.display();

        System.out.println("Enter the position at which the element should be inserted: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert in front: ");
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
        pos = sc.nextInt();
        list.deleteMiddle(pos);
        list.display();

    }
}
