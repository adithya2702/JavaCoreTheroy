import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int ele = sc.nextInt();
        Insert(pos, ele);
        //Delete(ele);
    }

    public static void Insert(int pos, int ele) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] temp = new int[arr.length + 1];
        for (int i = 0, j = 0; i < temp.length; i++, j++) {
            if (i == pos) {
                temp[i] = ele;
                j--;
            }
            else {
                temp[i] = arr[j];
            }
        }
        arr = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void Delete(int ele) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length;
        n=n-1;
        int []temp= new int[n];
        for(int i=0,k=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("The position of element" + ele +"is at " + i);

                continue;
            }
            temp[k++]=arr[i];
        }
        arr=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}