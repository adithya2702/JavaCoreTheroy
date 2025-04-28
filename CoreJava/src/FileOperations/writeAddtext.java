package FileOperations;
//To a data we need to add new data by this way ant writer we can use
import java.io.*;

public class writeAddtext {
    public static void main(String[] args) throws IOException {
        File f =new File("./sample.txt");
        String exsistFile = new String();
        String data ="";
        BufferedReader br = new BufferedReader(new FileReader(f));
        while((data=br.readLine())!=null){
            exsistFile+=data+"\n";
        }
        String s = "How are you";
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(exsistFile+s);
        bw.close();
        br.close();
    }
}
