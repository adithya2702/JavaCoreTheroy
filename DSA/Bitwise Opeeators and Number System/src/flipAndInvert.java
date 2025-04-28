public class flipAndInvert {
    public static void main(String[] args) {
        int [][]a={{1,1,0},{1,0,1},{0,0,0}};
        a=flipInv(a);
        for(int[]arr:a){
            for(int val:arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static  int[][] flipInv(int[][] a){
        int[][] arr = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                arr[i][j] = a[i][a.length-j-1];
                if(arr[i][j]==1) arr[i][j]=0;
                else arr[i][j]=1;
            }
        }
        return arr;
    }
}
