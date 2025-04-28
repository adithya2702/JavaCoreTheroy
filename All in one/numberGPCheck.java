import java.util.Scanner;
    public class numberGPCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int sum=0;
            for(int i=0; i<n; i++){
//                int num=a[i]+1;//This is more time complex
//                while (num % 2 == 0) {
//                    num /=2;
//                }
//                if(num==1){
//                    sum+=a[i];
//                }
                if((a[i]&a[n-1])==0){
                    sum+=a[i];
                }
            }
            System.out.println(sum);
        }
    }
