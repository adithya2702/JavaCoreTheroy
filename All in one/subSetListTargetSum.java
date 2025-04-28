import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class subSetListTargetSum {
    static List<List<Integer>> find(List<Integer> list,int n){
        Collections.sort(list);
        int maxRep=n/list.get(0);
        List<List<Integer>> ans = new ArrayList<>();
        int sum=n;
        for(int i=0;i<list.size();i++) {
            List<Integer> in = new ArrayList<>();
            for (int j = 0; j < maxRep; j++) {
                if(sum>0) {
                    sum-= list.get(i);
                    in.add(list.get(i));
                    if(list.contains(sum)){
                        in.add(sum);
                        System.out.println("in"+ in);
                        if(sum==0 && !ans.contains(in)) {
                            ans.add(in);
                            in.clear();
                            sum=n;
                        }
                        else{
                            in.remove((Integer) sum);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(7);
        int n = 7;
        System.out.println(find(l,n));
    }
}
