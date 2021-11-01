/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lwtgraph;

/**
 *
 * @author Natalia Solar
 */
public class LwtGraphTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LwtGraph g = createGraph();
        System.out.println(g);
        System.out.println(g.shortestPathsToString());
        System.out.println(g.unweighted(g.getVertex(3)));
        System.out.println(g.shortestPathsToString());
        
    }
    private static LwtGraph createGraph() {
        //graph from figure 9.14 in "Data Structures and Algorithm Analysis in Java" book
        LwtGraph graph = new LwtGraph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 6);
        graph.addEdge(4, 3);
        graph.addEdge(4, 6);
        graph.addEdge(4, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 7);
        graph.addEdge(7, 6);
        return graph;
    }
    
}
