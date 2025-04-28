
public class oops1 {
    //Create a data structure which stores student data(Name,RollNo,Marks)
    public static void main(String[] args) {
        Student [] student = new Student[5];
        Student s1 = new Student();
        s1.rollNo = 15;
        s1.name = "Adi";
        s1.marks = 75.5f;
        System.out.println(s1.marks);
    }
}
class Student{
    int rollNo;
    String name;
    float marks;
}
