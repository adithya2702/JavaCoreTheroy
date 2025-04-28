public class Looping {
    static int i=0;
    public static void main(String[] args) {
        //while loop
        while(i<10){
            System.out.println(i);
            i++;
        }

        //do while loop
        do{
            System.out.println(i);
            i++;
        }while(i<0);
        for(int i=0; i<10; i++){    //we can define i in outside for loop but initialize in for loop. we can increment the value in this line or inside the body of for loop
            System.out.println(i);
        }
        //We can also write in this way if we remove the compartments as they as in Interview
        int i;

        //for loop
        for(i=0;;){
            if(i<10){
                System.out.println(i);
                i++;
            }
            else break;
        }

        //for each loop can be used only for arrays and collections.
        //Its is only suitable for increment of 1
        int [] a= {1,2,3,4,5};
        for(int val:a){
            System.out.print(val+" ");
        }
    }
}
