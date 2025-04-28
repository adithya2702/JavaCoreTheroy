public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end=0;
    protected int front = 0;
    private int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is empty");
        int removed = data[front++];
        front=front% data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is Empty");
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue();
        cq.insert(5);
        cq.insert(11);
        cq.insert(25);
        cq.insert(2);
        cq.insert(18);
        cq.display();
        System.out.println(cq.remove());
        cq.display();
        cq.insert(99);
        cq.display();
    }
}
