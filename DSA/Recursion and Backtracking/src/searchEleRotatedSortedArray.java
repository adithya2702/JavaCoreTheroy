import java.util.ArrayList;

public class searchEleRotatedSortedArray {
    public static void main(String[] args) {
        int [] a = {4,5,1,2,3};
        System.out.println(find(a,2,0,a.length-1));
    }
    static int find(int[]a,int n,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==n){
            return m;
        }
        if(a[m]>=a[s]){
            if(a[s]<=n && a[m]>=n) return find(a,n,s,m-1);
            else return find(a,n,m+1,e);
        }
        else{
            if(a[m]<=n && a[e]>=n) return find(a,n,m+1,e);
            else return find(a,n,s,m-1);
        }
    }
}
