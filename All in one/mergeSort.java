public class mergeSort{
    public static void divide(int a[], int s, int e){
        if(s>=e)
            return;
        int mid = s+(e-s)/2;
        divide(a,s,mid);
        divide(a,mid+1,e);
        conqure(a,s,mid,e);
    }
    public static void conqure(int a[], int s, int mid, int e){
        int merge[] = new int[e-s+1];
        int idx1 = s;
        int idx2 = mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(a[idx1] <= a[idx2])
                merge[x++] = a[idx1++];
            else
                merge[x++]= a[idx2++];
        }
        while(idx1<=mid)
            merge[x++] = a[idx1++];
        while(idx2<=e)
            merge[x++]= a[idx2++];
        for(int i=0, j=s;i<merge.length; i++,j++ ){
            a[j] = merge[i];
        }
    }
    public static void main(String[] args) {
        int a[]= new int[]{40,50,30,10,20,10};
        int n= a.length;
        divide(a,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}