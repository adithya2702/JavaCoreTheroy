/*
if
if-else
Switch
 */
public class DecisionMaking {
    public static void main(String[] args) {
        //if-else
        int i= 20;
        if(i<0){
            System.out.println("It is negative number");
            if(i%2==0){
                System.out.println("It is even positive number");
            }
            else{
                System.out.println("It si odd positive number");
            }
        }
        else if(i==0){
            System.out.println("The given number is 0");
        }
        else{
            System.out.println("It is positive number");
        }


        //switch    we have unlimited outcomes
        int x=5;
        switch(x){
            case 1: System.out.println("This is first statement");
                break;//if we not break then further cases also execute until the break is writen
            case 3: System.out.println("This is third statement");
                break;
            case 5: System.out.println("This is fifth statement");
                break;
            default: System.out.println("This is default statement");
                break;
        }
    }
}
