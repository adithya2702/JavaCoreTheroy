package AccessModifer;

public class subclass extends student{
    public static void main(String [] args){
        subclass s = new subclass();
        s.getnum();//here we cannot directly print num because it is static
    }
    public void getnum(){
        System.out.println(num);
    }
}
