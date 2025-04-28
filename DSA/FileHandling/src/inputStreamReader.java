/*
    Streams are two types character stream and byte stream
    1) Byte Stream (Byte streams are used for reading and writing raw binary data, such as images, audio files, or any type of file that is not text. They operate on bytes and are designed to handle all types of data.)
        InputStream(FileInputStream,BufferedInputStream,DataInputStream)
        OutputStream(FileOutputStream,BufferedOutputStream,DataOutputStream)
    2) Character stream (Character streams are used for reading and writing characters, which are automatically encoded into bytes and vice versa. They are designed for handling text data.)
        Reader(FileReader,BufferedReader,InputStreamReader)
        Writer(FileWriter,BufferedWriter,OutputStreamWriter)
 */
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamReader {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            int number = isr.read();//read always take int value
            while(isr.ready()) {
                System.out.println((char) number);
                number = isr.read();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
