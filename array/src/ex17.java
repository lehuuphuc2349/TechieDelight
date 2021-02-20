import java.util.*;
public class ex17 {
    static class Edge
    {
        int source, dest;
        public Edge(int source, int dest) {
            this.source = source;
            this.dest = dest;
        }
    }
    static class Graph {
        List<List<Integer>> adjList = null;
        List<Integer> indegree = null;
        Graph(List<Edge> edges, int N) {
            adjList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                adjList.add(new ArrayList<>());
            }
            indegree = new ArrayList<>(Collections.nCopies(N, 0));
            for (Edge edge: edges) {
                int src = edge.source;
                int dest = edge.dest;
                adjList.get(src).add(dest);
                indegree.set(dest, indegree.get(dest) + 1);
            }
        }
    }
    static class Main {
        public static void findAllTopologicalOrders(Graph graph, Stack<Integer> path, boolean[] discovered, int N) {
            for (int v = 0; v < N; v++) {
                if (graph.indegree.get(v) == 0 && !discovered[v]) {
                    for (int u : graph.adjList.get(v)) {
                        graph.indegree.set(u, graph.indegree.get(u) - 1);
                    }
                    path.add(v);
                    discovered[v] = true;
                    findAllTopologicalOrders(graph, path, discovered, N);
                    for (int u : graph.adjList.get(v)) {
                        graph.indegree.set(u, graph.indegree.get(u) + 1);
                    }
                    path.pop();
                    discovered[v] = false;
                }
            }
            if (path.size() == N) {
                System.out.println(path);
            }
        }

        public static void printAllTopologicalOrders(Graph graph) {
            int N = graph.adjList.size();
            boolean[] discovered = new boolean[N];
            Stack<Integer> path = new Stack<>();
            findAllTopologicalOrders(graph, path, discovered, N);
        }
    }
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 6), new Edge(1, 2),
                new Edge(1, 4), new Edge(1, 6),
                new Edge(3, 0), new Edge(3, 4),
                new Edge(5, 1), new Edge(7, 0),
                new Edge(7, 1), new Edge(1, 3));
        int N = 8;
        Graph graph = new Graph(edges, N);
        Main.printAllTopologicalOrders(graph);
    }
}
