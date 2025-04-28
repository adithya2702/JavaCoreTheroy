package Arrays;

import java.util.*;
public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        System.out.println(value(row,col));
        int rows = sc.nextInt();
        List<List<Integer>> triangle = pascal(rows);
        for (List<Integer> row : triangle) {
            System.out.print(row);
        }
    }
    static List<List<Integer>> pascal(int row){
        List<List<Integer>> vv = new ArrayList<>();
        for(int i=0;i<row;i++){
            vv.add(eachRow(i));
        }
        return vv;
    }
    static List<Integer> eachRow(int n){
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<=n;i++){
            l.add((int)nCr(n,i));
        }
        return l;
    }
    static long value(int row,int col){

        return nCr(row-1,col-1);
    }
    static long nCr(int n,int r){
        if (r < 0 || n < r) return 0;
        if (r == 0 || r == n) return 1;
        if (r > n - r) r = n - r;
        long val = 1;
        for(int i=0;i<r;i++){
            val=val*(n-i);
            val=val/(i+1);
        }
        return val;
    }
}
