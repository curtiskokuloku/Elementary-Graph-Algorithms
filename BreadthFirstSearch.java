import java.util.*;

public class BreadthFirstSearch {
    public int V;   // # of vertices
    public LinkedList<Integer>[] adj;   // adjacency list

    // Constructor
    public BreadthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    // adds an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    // using the adjacency list
    public void BFS(int s) {
        boolean[] visited = new boolean[V]; // stores visited/not-visited vertices
        LinkedList<Integer> queue = new LinkedList<>(); // queue of bfs
        visited[s] = true;                  // current node is now visited
        queue.add(s);                       // add to queue

        while (!queue.isEmpty()) {
            s = queue.poll();               // gets first element in queue
            System.out.print(s + " ");      // prints it
            for (int n : adj[s]) {          // get all vertices adjacent to s
                if (!visited[n]) {
                    visited[n] = true;      // mark vertex that has been visited to true
                    queue.add(n);           // add that vertex to queue
                }
            }
        }
    }

    // BFS for Disconnected Graphs
    public static List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> bfsTraversal = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                visited[i] = true;
                queue.add(i);

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    bfsTraversal.add(node);

                    for (int neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }

        return bfsTraversal;
    }


    // main method
    public static void main(String[] args) {
        BreadthFirstSearch g = new BreadthFirstSearch(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BFS(2);
    }
}
