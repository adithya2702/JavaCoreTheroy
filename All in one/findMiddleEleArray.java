import java.util.Scanner;
public class findMiddleEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int l = 0,r = n-1, mid=0;
        while(l<r){
            mid = l+(r-l)/2;
            if(a[r]>a[mid]){
                r = mid;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(a[l]);
    }
}
