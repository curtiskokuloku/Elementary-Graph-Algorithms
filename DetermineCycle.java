import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DetermineCycle {

    public int V;
    public List<List<Integer>> adj;

    public DetermineCycle(int v) {
        V = v;
        adj = new ArrayList<>(v);

        for (int i = 0; i < v; i++)
            adj.add(new LinkedList<>());
    }

    private boolean isCycleHelper(int i, boolean[] visited, boolean[] recStack) {
        if (recStack[i]) {
            return true;
        }

        if (visited[i]) {
            return false;
        }

        recStack[i] = true;

        for (Integer c: adj.get(i))
            if (!visited[c] && isCycleHelper(c, visited, recStack))
                return true;

        recStack[i] = false;

        return false;
    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    public boolean isCycle()
    {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++)
            if (!visited[i] && isCycleHelper(i, visited, recStack))
                return true;

        return false;
    }

    public static void main(String[] args)
    {
        DetermineCycle graph = new DetermineCycle(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if(graph.isCycle())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}
