import java.util.*;
public class LargestNumberAfterDigitSwapsByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(largestInteger(num));
    }
    public static int largestInteger(int num) {
        int n=num;
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> originalDigits = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            originalDigits.add(digit);
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
            n /= 10;
        }
        StringBuilder result = new StringBuilder();
        for (int i = originalDigits.size() - 1; i >= 0; i--) {
            int digit = originalDigits.get(i);
            if (digit % 2 == 0) {
                result.append(even.poll());
            } else {
                result.append(odd.poll());
            }
        }

        return Integer.parseInt(result.toString());
    }
}
