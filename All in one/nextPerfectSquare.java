import java.util.Scanner;
public class nextPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
//        int sq = 1;
//        while(sq*sq < n){
//            sq+=1;
//        }
//        if(sq*sq==n)
//            System.out.println((sq+1)*(sq+1));
//        else
//            System.out.println("-1");
        System.out.println((long)Math.sqrt(n)*(long)Math.sqrt(n)==n?((long)Math.sqrt(n)+1)*((long)Math.sqrt(n)+1):-1);//Single line answer
    }
}
/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }


    @Test
    public void test2() {
        assertEquals(-1, NumberFun.findNextSquare(155));
    }

    @Test
    public void test3() {
        assertEquals(320356, NumberFun.findNextSquare(319225));
    }

    @Test
    public void test4() {
        assertEquals(15241630849L, NumberFun.findNextSquare(15241383936L));
    }

    @Test
    public void test5() {
        assertEquals(-1, NumberFun.findNextSquare(342786627));
    }


    @Test
    public void randomTest1() {
        long input = (long)(Math.random()*100000L)+1;
        long square = input*input;

        assertEquals(square+(input*2+1), NumberFun.findNextSquare(square));
    }


}
 */