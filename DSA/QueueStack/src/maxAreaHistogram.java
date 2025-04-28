import java.util.Stack;

public class maxAreaHistogram {
    public static void main(String[] args) {
        int[] a = {2,1,5,6,2,3};
        System.out.println(area2(a));
    }
    public static int area(int[] a) {
        int maxArea = 0;
        for (int i = 0; i < a.length; i++) {
            int area = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <a[i]) break;
                area += a[i];
            }
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) break;
                area += a[i];
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static int area2(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index < heights.length) {
            // If this bar is higher than the bar at stack top, push it to the stack
            if (stack.isEmpty() || heights[stack.peek()] <= heights[index]) {
                stack.push(index++);
            } else {
                // Pop the top
                int top = stack.pop();
                // Calculate the area with a[top] as the smallest (or minimum height) bar 'h'
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                // Update maxArea, if needed
                maxArea = Math.max(maxArea, area);
            }
        }
        // Now pop the remaining bars from stack and calculate area with each popped bar as the smallest bar
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
