# Elementary-Graph-Algorithms
Implementations of algorithms / operations that can be used on undirected and directed Graphs.

## Created by Curtis Kokuloku

### Breadth-first Search:

- The breadth-first search (BFS) algorithm is used to search a tree or graph data structure for a node that meets a set of criteria.
- It starts at the tree’s root or graph and searches/visits all nodes at the current depth level before moving on to the nodes at the next depth level. 
- Breadth-first search can be used to solve many problems in graph theory.
- We represent this directed graph using adjacency list representation.
- The time complexity is O(V+E), where V is the number of nodes and E is the number of edges.

### Depth-first Search:

- Depth-first search is an algorithm for traversing or searching tree or graph data structures.
- The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking.
- The time complexity of the algorithm is O(V + E), where V is the number of vertices and E is the number of edges in the graph.

### Determining if a graph is a Cycle:

- Given the root of a Directed graph, The task is to check whether the graph contains a cycle if yes then return true, return false otherwise
- There is a cycle in a graph only if there is a back edge present in the graph.
- Depth First Traversal can be used to detect a cycle in a Graph, DFS for a connected graph produces a tree.
- The time complexity of the algorithm is O(V+E), the same as the time complexity of DFS traversal which is O(V+E).
