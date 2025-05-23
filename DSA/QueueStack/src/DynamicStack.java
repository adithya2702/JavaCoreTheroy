import java.util.Arrays;

public class DynamicStack extends CustomStack{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            int [] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++) {
                temp[i] = data[i];
            }
            data=temp;
        }
        return super.push(item);
    }

}
