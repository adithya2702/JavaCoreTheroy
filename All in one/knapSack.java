import java.util.*;

class Items{
    int value;
    int weight;
    double ratio;

    Items(int value,int weight){
        this.value=value;
        this.weight=weight;
        this.ratio = (double) value/weight;
    }
    public double getRatio(){
        return ratio;
    }
}
class Knapsack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Items[] items = new Items[n];
        System.out.println("V\tW");
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i]=new Items(value,weight);
        }
        System.out.println("capacity:");
        int c= sc.nextInt();
        Arrays.sort(items,Comparator.comparing(Items::getRatio).reversed());
        int totalWeight =0;
        int totalValue =0;
        int[] select = new int[n];
        for(int i=0;i<n;i++){
            if(totalWeight+items[i].weight<=c){
                totalWeight+=items[i].weight;
                totalValue+=items[i].value;
                select[i]=1;
            }
            else{
                select[i]=0;
            }
        }

        for(int val:select){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println(totalValue);
    }

}
