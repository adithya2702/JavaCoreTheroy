import java.util.Scanner;
public class start0end1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int start=0,end=n-1;
        while(start<end){
            if(a[start]==0){
                start++;
            }
            if(a[end]==1){
                end--;
            }
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
