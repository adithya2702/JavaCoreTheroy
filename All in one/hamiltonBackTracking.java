import java.util.Scanner;
class hamiltonBackTracking{
    private int v;
    private int []path;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v= sc.nextInt();
        boolean [][]graph= new boolean[v][v];
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                graph[v][v]= sc.nextBoolean();
            }
        }

    }
}