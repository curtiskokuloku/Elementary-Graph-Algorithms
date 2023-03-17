import java.util.*;

public class DepthFirstSearch{
    public int V;
    public List<Integer>[] adj;

    // Constructor
    public DepthFirstSearch(int v) {
        V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // adds edges to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // calls recursive method DFSUtil to traverse the list
    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    // helper method used by DFS to visit every vertex, and mark as visited
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // main method to test
    public static void main(String[] args) {
        DepthFirstSearch g = new DepthFirstSearch(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        g.DFS(2);
    }
}
