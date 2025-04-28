package FileOperations;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readUsingScanner {
    public static void main(String[] args)throws IOException {
        File f = new File("./sample.txt");

        Scanner sc= new Scanner(f);//we can also provide file input stream in place of f no problem.
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

        //Or we can do this to print save full text in single string
        String data="";
        while(sc.hasNext()){
            data+=sc.nextLine()+"\n";
        }
        System.out.println(data);
        sc.close();
    }
}
