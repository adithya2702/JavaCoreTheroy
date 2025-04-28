package ExceptionHandling;

public class finallyBlockNotPrint {
    public static void main(String[] args) {
        try{
            int []a = {1,2};
            System.out.println();
            System.out.println(a[2]/0);
        }
        catch(Exception e1){
            System.out.println("catch block");
            System.exit(0);//after this line no line is executed in java
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("hii");
    }
}
