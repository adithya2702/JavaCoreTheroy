// Java program to check if a given instance of N*N-1
// puzzle is solvable or not
import java.util.*;

class puzzle15 {
    static final int N = 4;

    // A utility function to count inversions in given
    // array 'arr[]'. Note that this function can be
    // optimized to work in O(n Log n) time. The idea
    // here is to keep code small and simple.
    static int getInvCount(int[] arr)
    {
        int inv_count = 0;
        for (int i = 0; i < N * N - 1; i++) {
            for (int j = i + 1; j < N * N; j++) {
                // count pairs(arr[i], arr[j]) such that
                // i < j but arr[i] > arr[j]
                if (arr[j] != 0 && arr[i] != 0
                        && arr[i] > arr[j])
                    inv_count++;
            }
        }
        return inv_count;
    }

    // find Position of blank from bottom
    static int findXPosition(int[][] puzzle)
    {
        // start from bottom-right corner of matrix
        for (int i = N - 1; i >= 0; i--)
            for (int j = N - 1; j >= 0; j--)
                if (puzzle[i][j] == 0)
                    return N - i;
        return -1;
    }

    // This function returns true if given
    // instance of N*N - 1 puzzle is solvable
    static boolean isSolvable(int[][] puzzle)
    {
        // Count inversions in given puzzle
        int[] arr = new int[N * N];
        int k = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                arr[k++] = puzzle[i][j];

        int invCount = getInvCount(arr);

        // If grid is odd, return true if inversion
        // count is even.
        if (N % 2 == 1)
            return invCount % 2 == 0;
        else // grid is even
        {
            int pos = findXPosition(puzzle);
            if (pos % 2 == 1)
                return invCount % 2 == 0;
            else
                return invCount % 2 == 1;
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int[][] puzzle
                = { { 1,2,3,4},
                { 5,6,0 ,7},
                { 9,10,12,8}, // Value 0 is used for empty space
                {11,13,14,15} };

		/*
		int[][] puzzle = {
			{1, 8, 2},
			{0, 4, 3},
			{7, 6, 5}
		};

		int[][] puzzle = {
			{13, 2, 10, 3},
			{1, 12, 8, 4},
			{5, 0, 9, 6},
			{15, 14, 11, 7}
		};

		int[][] puzzle = {
			{6, 13, 7, 10},
			{8, 9, 11, 0},
			{15, 2, 12, 5},
			{14, 3, 1, 4}
		};

		int puzzle[N][N] = {
					{3, 9, 1, 15},
					{14, 11, 4, 6},
					{13, 0, 10, 12},
					{2, 7, 8, 5},
				};
	*/
        System.out.println(isSolvable(puzzle)
                ? "Solvable"
                : "Not Solvable");
    }
}

// This code is contributed by rutikbhosale.
