import java.util.Scanner;

// Backtracking Algorithm

//DFS is good to slove
public class hamiltonianCycle {
    private int V;
    private int[][] graph;
    private int[] path;

    public hamiltonianCycle(int v) {
        V = v;
        graph = new int[V][V];
        path = new int[V];
    }

    public boolean isSafe(int v, int pos, int[] path) {
        if (graph[path[pos - 1]][v] == 0)
            return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;
        return true;
    }

    public boolean hamCycleUtil(int[] path, int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }
        for (int v = 1; v < V; v++) {
            if (isSafe(v, pos, path)) {
                path[pos] = v;
                if (hamCycleUtil(path, pos + 1))
                    return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    public boolean hamCycle() {
        for (int i = 0; i < V; i++)
            path[i] = -1;

        path[0] = 0;
        if (!hamCycleUtil(path, 1)) {
            System.out.println("No Hamiltonian Cycle exists");
            return false;
        }
        printSolution(path);
        return true;
    }

    public void printSolution(int[] path) {
        System.out.println("Hamiltonian Cycle Exists: ");
        for (int i = 0; i < V; i++)
            System.out.print(" " + path[i] + " ");
        System.out.println(" " + path[0] + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        hamiltonianCycle hamiltonianCycle = new hamiltonianCycle(V);

        System.out.println("Enter the adjacency matrix:");

        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                hamiltonianCycle.graph[i][j] = scanner.nextInt();

        hamiltonianCycle.hamCycle();

        scanner.close();
    }
}
