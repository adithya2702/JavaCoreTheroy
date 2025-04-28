import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Using dp
public class infiniteSupplyOfCoins {
    public static int find(int[] a,int k){
        List<List<Integer>> outer = new ArrayList<>();
        int count=0;
        outer.add(new ArrayList<>());
        int start=0,end=0;
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int size = outer.size();
            for(int j=start;j<size;j++){
                List<Integer> inn = new ArrayList<>(outer.get(j));
                inn.add(a[i]);
                    outer.add(inn);
            }
            for(int j=0;j<outer.size();j++){
                if(sum(outer.get(j))==k) count++;
            }
        }
        return count;
    }
    public static int sum(List<Integer> list){
        int sum=0;
        for(int i:list)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a ={1,2,3};
        System.out.println(find(a,n));
    }
}
