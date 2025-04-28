//Type inference means in compilation time it check value for the variable and assign datatype to it automatically. By using var keyword without specifying datatype we can store value in the variable.
public class inferenceWithLocalVariables {
    public static void main(String[] args) {
        var i =20;//this var keyword works only in java10 and above
        //This is used in only local variable level means only inside method, and also we should define and initialize the value in sme line to this var because in compilation time it checks the value in the same line to know its datatype.

        //When used with arrays we should not include [] fot var
        var arr=new int[5];
    }
}
