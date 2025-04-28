package OOPS.Encapsulation;
//wrapping variables and methods is called encapsulation
//class is example of encapsulation
public class student {
    String name;
    private int roll;
    private boolean attend;
    public student(int roll){
        this.roll=roll;
    }
    public void setAttend(boolean flag){
        if(!attend) attend=flag;
        System.out.println("Teacher take attendance");
    }
    public boolean getAttend(){
        System.out.println("Teacher accessed attendance");
        return attend;
    }

}
