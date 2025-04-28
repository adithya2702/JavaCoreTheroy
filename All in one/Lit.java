import java.util.Scanner;

public class Lit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter the adjacency matrix (enter -1 if there is no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        primMST(graph);
    }

    private static void primMST(int[][] graph) {
        int n = graph.length;

        // Array to store constructed MST
        int[] parent = new int[n];

        // Key values used to pick the minimum weight edge
        int[] key = new int[n];

        // Boolean array to represent whether a vertex is included in MST or not
        boolean[] mstSet = new boolean[n];

        // Initialize all keys as INFINITE
        for (int i = 0; i < n; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // Always include the first vertex in MST
        key[0] = 0;
        parent[0] = -1; // First node is always root of MST

        // Construct MST for the remaining (n-1) vertices
        for (int count = 0; count < n - 1; count++) {
            // Pick the minimum key vertex from the set of vertices not yet included in MST
            int u = minKey(key, mstSet, n);

            // Include the picked vertex in MST
            mstSet[u] = true;

            // Update key value and parent index of the adjacent vertices of the picked vertex
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != -1 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the constructed MST
        printMST(parent, graph, n);
    }

    private static int minKey(int[] key, boolean[] mstSet, int n) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < n; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private static void printMST(int[] parent, int[][] graph, int n) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }
}
