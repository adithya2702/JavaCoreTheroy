import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class krushkals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of node4" +
                "s: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int m = scanner.nextInt();

        Edge[] edges = new Edge[m];

        System.out.println("Enter edges (node1 node2 weight):");
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            edges[i] = new Edge(u, v, w);
        }

        kruskalMST(edges, n);
    }

    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    private static void kruskalMST(Edge[] edges, int n) {
        Arrays.sort(edges, Comparator.comparingInt(e -> e.weight));

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        System.out.println("Edges in the Minimum Spanning Tree:");

        for (Edge edge : edges) {
            int rootSrc = find(parent, edge.src);
            int rootDest = find(parent, edge.dest);

            if (rootSrc != rootDest) {
                System.out.println(edge.src + " - " + edge.dest + "\tWeight: " + edge.weight);
                union(parent, rootSrc, rootDest);
            }
        }
    }

    private static int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }

    private static void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        parent[rootX] = rootY;
    }
}
