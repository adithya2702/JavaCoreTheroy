import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[]a ={7,3,5,2,8,1,9};
        a=mergesort(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] mergesort(int []a){
        if(a.length==1){
            return a;
        }
        int mid = a.length/2;
        int[] left = mergesort(Arrays.copyOfRange(a,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    static int[] merge(int[]a,int[]b){
        int [] arr = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
        return arr;
    }
}
