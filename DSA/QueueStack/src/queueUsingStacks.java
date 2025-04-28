import java.util.Stack;

public class queueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    queueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void insert(int item){
        first.push(item);
    }
    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek =  second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }
    public static void main(String[] args) {

    }
}
