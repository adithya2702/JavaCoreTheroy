package FileOperations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readBufferReader {
    public static void main(String[] args) throws IOException {
        File f= new File("./sample.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);//we can pass here FileReader or FileInputStreamer or InputStreamReader but cant file directly
        String line="";
        while(br.readLine()!=null){
            line+=br.readLine()+"\n";
        }
        System.out.println(line);
        fr.close();
        br.close();
    }
}
