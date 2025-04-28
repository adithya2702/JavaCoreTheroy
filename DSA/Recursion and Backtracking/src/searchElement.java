public class searchElement {
    public static void main(String[] args) {
        int [] arr= {1,2,3,5,2,2};
        //System.out.println(search(arr,4));
        findAllIndex(arr,2,0);
    }
    static int search(int[]a,int n){
        return index(a,n,0);
    }
    static int index(int[]a,int n,int index){
        if(index==a.length) return -1;
        if(a[index]==n) return index;
        return index(a,n,index+1);
    }
    static void findAllIndex(int[]a ,int n,int index){
        if(index==a.length) return ;
        if(a[index]==n) System.out.print(index+" ");
        findAllIndex(  a,n,index+1);
    }
}
