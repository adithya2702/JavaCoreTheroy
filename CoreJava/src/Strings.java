//String is a non-primitive data type of class and also called literal because if we create an object for a class and print it gives the address but String class give the value in it the object.
import java.text.DecimalFormat;
import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {
        //Different ways to assign a string
        String s1 = "Hello!";//This will store in string pool memory
        String s2 = new String("Hello!");// This is different from above it stores in heap memory
        String s3 = "Hello!";
        String s4 = new String("Hello!");
        System.out.println(s1==s2);// == operator compares the address
        System.out.println(s1==s3);// This is equal because java to save memory it also gives same s1 memory address to this
        System.out.println(s2==s4);// This is not equal because it creates separate heap memory for different object
        System.out.println(s1.equals(s2));// This compares the data
        /*String Methods
        1. startsWith
        2. endsWith
        3. contains
        4. equals
        5. equalsIgnoreCase
        6. length
        7. trim
        8. toLowerCase
        9. toUpperCase
        10.toCharArray
        11.indexOf
        12.lastIndexOf
        13.substring
        14.split
        15.charAt
        16.replace
        17.replaceAll
        18.valueOf
        19.isEmpty
        20.isBlank
         */
        String st1 = "HEllo";
        String st2 = "hello";
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st1.contains("El"));
        System.out.println(st1.startsWith("he"));
        System.out.println(st1.endsWith("o"));
        String st3 = " He llo World   ";
        System.out.println(st1.length());
        System.out.println(st3.trim());// This function just trims the starting and ending spaces
        System.out.println(st3.toLowerCase());
        System.out.println(st3.trim().toUpperCase());
        char [] a = st3.toCharArray();
        System.out.println("Array is"+String.valueOf(a));
        System.out.println(st3.indexOf("o"));
        System.out.println(st3.lastIndexOf("o"));
        System.out.println(st3.substring(3));
        System.out.println(st3.substring(3,8));
        String st4 = "Hello^world^how^are^you?";
        System.out.println(Arrays.toString(st4.split("\\^",2)));//Sometimes for special characters split function can't recognize then use double backward slash\\
        System.out.println(st4.charAt(3));
        System.out.println(st4.replace("how","where"));
        System.out.println(st3.replaceAll("World","globe"));
        //data type conversions
        String s5 = "180";
        int i = Integer.valueOf(s5);
        System.out.println(i);
        int j = 73983;
        String s6 = String.valueOf(j);
        System.out.println("s6: "+ s6);
        String s7;
        String s8 = "  ";
        String s9 = "";
        //System.out.println(s7.isEmpty());// we cant apply methods to it
        System.out.println(s8.isEmpty());//false
        System.out.println(s8.isBlank());//true
        System.out.println(s9.isBlank());//true
        System.out.println(s9.isEmpty());//true


        //Use of String.valueOf()
        int[] intArray = {1, 2, 3, 4, 5};
        String intArrayString = String.valueOf(intArray);//This prints the address value
        System.out.println("intArray as string: " + intArrayString);

        char[] charArray = {'a', 'b', 'c', 'd'};
        String charArrayString = String.valueOf(charArray);//This print the value as abcd this method is explicitly for charArray
        System.out.println("charArray as string: " + charArrayString);

        String[] stringArray = {"apple", "banana", "cherry"};
        String stringArrayString = String.valueOf(stringArray);//This prints the address
        System.out.println("stringArray as string: " + stringArrayString);


        //Convert arrays to String
        int[] arr = {1, 2, 3, 4, 5};
        String s10 = "";
        for (int num : arr) {
            s10 += num;
        }
        System.out.println("intArray as string: " + s10);
        //Similar u can use this for string type of array

        //Split
        String name = "Adi Sohan Sudha Baby";
        String [] names = name.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off decimal format
        DecimalFormat df = new DecimalFormat("000.00000");
        System.out.println(df.format(7.23));

        //Integer.parseInt is used to convert a string to integer
        //int n=(int)s3;//this doesn't convert
        String num = "9";
        int n=Integer.parseInt(num);
        System.out.println(n);

        //Some string operators
        System.out.println('a'+2);
        System.out.println('a'+'b');//returns integer value
        System.out.println('a'+"b");
        System.out.println("a"+"b");
        System.out.println("a"+1);
        System.out.println('a'+0);//convert to int ascii value

        char digitChar = '3';
        int digit = digitChar - '0';
        System.out.println(digit); // Output: 3

        int digit2 = 3;
        System.out.println(3+'0');//Output: 51 //int ascii value of 3
        char digitChar2 = (char) (digit2 + '0');
        System.out.println(digitChar2); // Output: 3
        System.out.println();
        System.out.println('3'+'0');
        System.out.println('3'-'0');
        System.out.println(3+'0');
        System.out.println(3-'0');
        System.out.println('a'-0);
        System.out.println('a'+0);
    }
}