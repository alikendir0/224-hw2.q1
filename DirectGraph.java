import java.util.LinkedList;

public class DirectGraph {
  private final int V;// number of vertices
  private int E;// number of edges
  private LinkedList<Integer>[] adj;// adjacency list of vertices

  public DirectGraph(int V) {
    this.V = V;
    this.E = 0;
    adj = (LinkedList<Integer>[]) new LinkedList[V];
    for (int v = 0; v < V; v++)
      adj[v] = new LinkedList<Integer>();// adj list for each vertex
  }

  public int V() {
    return V;// retrun number of vertices
  }

  public int E() {
    return E;
  }

  public void addEdge(int v, int w) {
    adj[v].add(w);// adding directed edge betwen v and w
    E++;// incrementing number of edges
  }

  public Iterable<Integer> adj(int v) {// adjacent vertices of the selected vertex
    return adj[v];
  }
}