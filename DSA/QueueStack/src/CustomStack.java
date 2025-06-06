public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer]=item;
        return true;
    }
    public boolean isFull(){
        return pointer== data.length-1;
    }
    public boolean isEmpty(){
        return pointer==-1;
    }
    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is empty");
        return data[pointer--];
    }
    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is empty");
        return data[pointer];
    }
}
