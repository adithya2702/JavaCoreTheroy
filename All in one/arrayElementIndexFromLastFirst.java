import java.util.Scanner;
public class arrayElementIndexFromLastFirst {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int [] a = new int[n];
       for(int i=0;i<n; i++){
           a[i]=sc.nextInt();
       }
       int ele = sc.nextInt();
       int f=0,l=n-1,mid=0;
       while(f<l){
           mid=f+(l-f)/2;
           if(a[mid]==ele){
               System.out.println(mid);
               System.out.println(n-mid);
               return;
           }
           if(a[f]<a[mid]){
               l=mid-1;
           }
           else{
               f=mid+1;
           }
       }
    }
}
