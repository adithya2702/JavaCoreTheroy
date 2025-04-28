import java.util.Scanner;
public class twoWheeler4WheelerVehicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        vehicle(n,w);
    }
    static int i=0;
    public static void vehicle(int n,int w){
        if(possible(n,i,w)){
            System.out.println("Car "+ n);
            System.out.println("Bike "+i);
            return;
        }
        i++;
        vehicle(n-1,w);

    }
    public static boolean possible(int car,int bike,int w){
        return car * 4 + bike * 2 == w;
    }
}
