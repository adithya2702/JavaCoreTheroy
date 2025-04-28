public class happyNumber {
    public static void main(String[] args) {
        //System.out.println(happy(19));
        System.out.println(happyLL(2));
    }
    static boolean happy(int num){
        while(num!=1){
            int newNum=0;
            while(num>0){
                newNum = newNum + (num % 10) * (num % 10);
                num=num/10;
            }
            num=newNum;
        }
        return true;
    }
    static boolean happyLL(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSumSquare(slow);
            fast=findSumSquare(findSumSquare(fast));
            if (slow == fast) {
                return false;
            }
        }while(slow!=1 && fast!=1);
        return true;
    }
    static int findSumSquare(int n){
        int newNum = 0;
        while(n>0){
            newNum += (n%10)*(n%10);
            n/=10;
        }
        return newNum;
    }
}
