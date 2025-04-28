package FileOperations;
//Properties file have an extension as .properties like text file as .txt and in properties file we store the data as key value pairs extends map Interface.
//we write in notepad
//Real time use of properties file is if we want to change the data(localhost address or username or password) then no need to change the application code by opening java environment we get those key value pairs outside and can access in properties files
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class propertiesFile {
    public static void main(String[] args)throws Exception {
        File f = new File("dbConfig.properties");
        if(!f.exists())  f.createNewFile();
        Properties prop = new Properties();
        FileOutputStream fos = new FileOutputStream(f);
        prop.setProperty("url","localhost");
        prop.setProperty("username","admin");
        prop.setProperty("pass","admin123");
        prop.store(fos,"New prop file is created");

        FileInputStream fis = new FileInputStream(f);
        prop.load(fis);
        //want to see all keys in properties here it returns set because keys are unique
        Set<Object> keys = prop.keySet();
        System.out.println(keys);
        //want to get values
        Collection<Object> c = prop.values();
        System.out.println(c);
        //get value for key
        System.out.println(prop.getProperty("url"));
        //if the given key not present in set then we want to return our name we use another property
        System.out.println(prop.getProperty("time","Adi"));

        //want to print key value pair
        for(Object key:prop.keySet()){
            System.out.println(key+" - "+prop.getProperty((String)key));
        }
        //Or
        Set<Map.Entry<Object,Object>> data = prop.entrySet();
        for(Map.Entry<Object,Object> entry:data){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        //if we want to update value we use concept of map
        prop.setProperty("url","192.168.10.21");
        //want to delete one entry
        prop.remove("url");
    }
    //we write the logic for Database here
    //operations also here with methods
}
/*
we like this in properties file
    url = localhost address
    username = admin
    pass = admin123

 */
