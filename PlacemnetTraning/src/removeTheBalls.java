import java.util.*;

public class removeTheBalls {
    public static int number(int n){
        List<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(1);
        }
        list.add(sb.toString());
        int count=0;
        int left=0;
        for(int right=0;right<sb.length();right++){
            if(sb.charAt(right)=='1'){
                ++count;
            }
            if(count==3){
                sb.replace(left,right+1,"3");
                list.add(sb.toString());
                if(right<sb.length()) {
                    right = left;
                    left = right+1;
                    count = 0;
                }
            }
        }
        int total=1;
        for(int i=1;i<list.size();i++){
            total+=find("",list.get(i));
        }
        return total;
    }
    public static int find(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last= p.substring(i);
            count+=find(first+c+last,up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(number(n));
    }
}
