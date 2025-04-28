package FileOperations;
/*Streams are two types character stream and byte stream
        1) Byte Stream (Byte streams are used for reading and writing raw binary data, such as images, audio files, or any type of file that is not text. They operate on bytes and are designed to handle all types of data.)
                InputStream(FileInputStream,BufferedInputStream,DataInputStream)
                OutputStream(FileOutputStream,BufferedOutputStream,DataOutputStream)
        2) Character stream (Character streams are used for reading and writing characters, which are automatically encoded into bytes and vice versa. They are designed for handling text data.)
                Reader(FileReader,BufferedReader,InputStreamReader)
                Writer(FileWriter,BufferedWriter,OutputStreamWriter)
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
We have 4 ways to read the data from file
    FileInputStream(char by char)
    Scanner(char by char and line by line)
    FileReader(same as fis)
    BufferReader(char by char and line by line)
 */
public class readFile {
    public static void main(String[] args) throws IOException {
        File f = new File("./sample.txt");
        if(!f.exists())
            f.createNewFile();
        FileInputStream  fis= new FileInputStream(f);//out file come to this fileinputstream and then we can read.
        System.out.println((char)fis.read());//this read function gives each value in the file so to print all we use loops at the end it returns -1;
        int value;
        while((value=fis.read())!=-1){
            System.out.print((char)value);//it prints character by character
        }
        //or we can display in another way
        String data="";
        while((value=fis.read())!=-1){
            data+=String.valueOf((char)value);
        }
        System.out.println();
        System.out.println(data);
        fis.close();//we need to close the streams if we not close it leads to data leak.
    }
}
