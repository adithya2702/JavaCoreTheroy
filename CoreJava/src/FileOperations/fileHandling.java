package FileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/padavalaadithya/College ppts/Test/resume.txt");//separators are '//' and '\' in java. Here we can also provide relative path as "./resume.text" this will be created in the source path where this project is located
//        if(f.exists())//return that file exists or not
//            f.delete();//to delete file
//        System.out.println(f.createNewFile());//to create file
//        System.out.println(f.isHidden());//we can check is file hidden
//        System.out.println(f.canWrite());//we can check the file is in read only mode are not

        //create directory
        /*
        we have 2 methods for it
            1) .mkdir() //It will create one folder u mentioned
            2) .mkdirs() //It check that the folders u mentioned are exists if not it will create all folders which are not created
         */
        //File f2 = new File("/Users/padavalaadithya/College ppts/Test/Test2/Test3");
        //System.out.println(f2.mkdir());
        //System.out.println(f2.mkdirs());
//        if(f2.exists())
//            f2.delete();
//        System.out.println(f2.exists());
        File f3 = new File("/Users/padavalaadithya/College ppts");
        System.out.println(Arrays.toString(f3.list()));//what are folders or files in that folder
        System.out.println(Arrays.toString(f3.listFiles()));//path of each file in that folder
        System.out.println( f.getName());
        System.out.println( f.getAbsolutePath());
        File f4 = new File(f.getParent()+"resume2.txt");
        System.out.println(f4.createNewFile());
        System.out.println(new Date(f.lastModified()));//generally it prints long format we change it to date format
    }
}
