import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetArray {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        List<List<Integer>> ans = subset(a);
        for(List<Integer> val : ans) System.out.println(val);
        //int[] b = {1,3,2,2};
        //List<List<Integer>> ans2 = subsetDuplicate(b);
        //for (List<Integer> val2 : ans2) System.out.println(val2);
    }

    static List<List<Integer>> subsetDuplicate(int[] a) {
        Arrays.sort(a); // Sort the array to handle duplicates
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // Start with an empty subset
        int start, end = 0;

        for (int j = 0; j < a.length; j++) {
            start = 0; // Start index for adding new subsets
            if (j > 0 && a[j] == a[j - 1]) {
                start = end + 1; // Skip the subsets created in the last iteration
            }
            end = outer.size() - 1; // Update end to the last index of the current subsets

            int size = outer.size();
            for (int i = start; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // Create a new subset
                inner.add(a[j]); // Add the current element to the subset
                outer.add(inner); // Add the new subset to the list of subsets
            }
        }
        return outer;
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num :arr){
            int n =outer.size();
            for(int i=0;i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}