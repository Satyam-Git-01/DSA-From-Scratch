package GraphFolder;

import java.util.*;

public class CustomGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.printGraph();
    }

    static class Graph {
        int adj[][];
        //List<List<Integer>> adjcacencylist = new ArrayList<>(); 2nd way ,e,eory efficeint

        Graph(int numberOfVertices) {
            adj = new int[numberOfVertices][numberOfVertices];
        }

        void addEdge(int source, int destination) {
            // undirected graph
            adj[source][destination] = 1;
            adj[destination][source] = 1;
        }

        void printGraph() {
            for (int i = 0; i < adj.length; i++) {
                for (int j = 0; j < adj[i].length; j++) {
                    if (adj[i][j] == 1) {
                        System.out.println(i + "->" + j + " ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
