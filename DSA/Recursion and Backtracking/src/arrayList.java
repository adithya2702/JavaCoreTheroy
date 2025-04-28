import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,8};
        //System.out.println(findEle(a,4,0));
        System.out.println(findAllIndex(a,4,0));
    }
    static List<Integer> l= new ArrayList<>();
    static List<Integer> findEle(int []a,int n,int index){
        if(index==a.length){
          return l;
        }
        if(a[index]==n) l.add(index);
        return findEle(a,n,index+1);
    }
    //If the requirement create list inside method then use below approach
    static List<Integer> findAllIndex(int[]a,int n,int index){
        List<Integer> l2= new ArrayList<>();
        if(index==a.length){
            return l2;
        }
        if(a[index]==n) l2.add(index);
        List<Integer> ans = findAllIndex(a,n,index+1);
        l2.addAll(ans);
        return l2;
    }
}
