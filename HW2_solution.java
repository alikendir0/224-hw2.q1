import java.util.Scanner;

public class HW2_solution {
  public static void main(String[] args) {
    FileRead a = new FileRead("HW2_Q1_text.txt");// file location given to fileread

    int V = Integer.parseInt(a.Read());// getting the number of vertices through fileread
    System.out.println(" V=" + V);
    DirectGraph g = new DirectGraph(V + 1);// creating V+1 vertexed graph since question expects us to

    Valuefinder k = new Valuefinder();// iniating valuefinder

    int E = Integer.parseInt(a.Read());// getting the number of edges through fileread
    System.out.println("E=" + E);
    for (int i = 0; i < E; i++) {// adding the edges Y times
      int[] temp = k.value((a.Read()));
      g.addEdge(temp[0], temp[1]);
      System.out.println(temp[0] + " " + temp[1]);
    }
    System.out.println("\nStart Point:");
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();// starting point
    System.out.println(h);
    TwoAhead(g, h);// twoahead initialized
    s.close();
  }

  public static void TwoAhead(DirectGraph G, int s) {
    for (int w : G.adj(s)) {// looping through each adjacent vertex of given vertex s
      for (int x : G.adj(w)) {// looping hrough each adjacent vertex of given vertex w
        System.out.println(s + " " + w + " " + x);// printing a twoahead path for vertex s
      }
    }
  }
}