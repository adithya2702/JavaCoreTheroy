package FileOperations;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class readFilereader {
    public static void main(String[] args) throws IOException{
        File f= new File("./sample.txt");
        FileReader fr = new FileReader(f);
        fr.read();//it works same as file input stream same while u can use to readthe file
        fr.close();
    }
}
