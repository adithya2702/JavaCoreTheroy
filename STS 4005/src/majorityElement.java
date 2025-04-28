import java.util.Scanner;
public class majorityElement {
    static void maxCount(int []arr,int n){
        int maxcount=0,index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                index=i;
            }
        }
        if(maxcount>n/2){
            System.out.println(arr[index]);
        }
        else{
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxCount(arr,n);

        sc.close();
    }
}