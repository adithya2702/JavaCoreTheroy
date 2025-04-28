import java.util.*;
public class leadersInArray {
    static void leaders(int[]arr,int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.print(arr[i]+" ");
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leaders(arr,n);

        sc.close();
    }
}
