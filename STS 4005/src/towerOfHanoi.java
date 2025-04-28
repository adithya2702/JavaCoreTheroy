import java.util.*;
class TowerOfHanoi{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofHanoi(n,'A','B','C');
    }
    public static void towerofHanoi(int n,char from,char help,char to){
        if(n==1){
            System.out.println("Move disk from "+from+"->"+to);
            return;
        }
        towerofHanoi(n-1,from,to,help);
        towerofHanoi(1,from,help,to);
        towerofHanoi(n-1,help,from,to);
    }
}