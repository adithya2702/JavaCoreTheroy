import java.util.*;
class priorityQueueArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []a = new int[n];
        int []p = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
            p[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int max=i;
            for(int j=i+1; j<n; j++){
                if(p[max]<p[j])
                    max=j;
            }
            int temp= a[i];
            a[i]=a[max];
            a[max] =temp;
            int temp2= p[i];
            p[i]=p[max];
            p[max] =temp2;
        }
        for(int i=n-1; i>=0; i--){
            System.out.println(a[i]+" "+p[i]);
        }
    }
}