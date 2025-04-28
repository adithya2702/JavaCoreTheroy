package FileOperations;
import java.io.*;

/*
Write the data 3 methods
    FileOutputStream
    FileWriter
    BufferWriter
 */
public class writeFile {
    public static void main(String[] args) throws IOException {
        File f =new File("./sample.txt");
        if(f.exists())
            f.delete();
        f.createNewFile();
        FileOutputStream fos =new FileOutputStream(f);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);// we need to pass fw in it
        fos.write(72);
        fos.write(73);
        fos.write(75);
        // we can give input string in the sample file as shown
        String s ="Hello";
        for(char ch:s.toCharArray()){
            fos.write(ch);
        }
        String s2 ="Hello world";
        fw.write(s2);//It is good directly write the string


        fw.close();
        fos.close();
        bw.close();
    }
}
