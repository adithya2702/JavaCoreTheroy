import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[]a = {6,3,4,2,7,1,9};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void quicksort(int[] a,int st,int end){
        if(st>=end){
            return;
        }
        int s=st;
        int e=end;
        int p=a[s+(e-s)/2];
        while(s<=e) {
            while (a[s] < p) {
                s++;
            }
            while (a[e] > p) {
                e--;
            }
            if(s<=e) {
                int temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }
        quicksort(a,st,e);
        quicksort(a,s,end);
    }
}
