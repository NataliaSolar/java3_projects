package lwtgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Natalia Solar
 */
public class LwtGraph {

    private Map<Vertex, ArrayList<Vertex>> adjVertices;
    private Map<Vertex, Integer> shortestPath;
    private static final Integer INFINITY = Integer.MAX_VALUE;
    
    public LwtGraph(){
        adjVertices = new HashMap<>();
        shortestPath = new HashMap<>();
    }

    // add an element to the vertices set
    public void addVertex(Integer label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
        shortestPath.putIfAbsent(new Vertex(label), INFINITY);
    }
    
    public Vertex getVertex(Integer label){
        //check if vertex is present in the graph (adjVertices map)
        boolean found = false;
        for (Map.Entry<Vertex, ArrayList<Vertex>> entry : adjVertices.entrySet()){
            if(entry.getKey().label ==label) found = true;
        }
        if(!found) throw new NullPointerException("The graph doesn't contain vertex with label " + label);
        return new Vertex(label);
    }

    // add an edge to the graph
    public void addEdge(Integer label1, Integer label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
    }
    
    //get adjacant vertices of the vertex with this label
    public List<Vertex> getAdjVertices(Integer label) {
        return adjVertices.get(new Vertex(label));
    }
    
    
    public Map<Vertex, Integer> unweighted( Vertex s ){
        
        LinkedQueue q = new LinkedQueue( );
//        for each Vertex v
//            v.dist = INFINITY;
            
        //s.dist = 0;
        shortestPath.put(s,0);
        
        q.enqueue( s );
            
        while( !q.empty( ) )
        {
            Vertex v = q.dequeue( );
            //for each Vertex w adjacent to v
            for(Vertex w : getAdjVertices(v.label))
            {
                //if( w.dist == INFINITY )
                if( shortestPath.get(w) == INFINITY )
                {
                    //w.dist = v.dist + 1;
                    shortestPath.put(w,shortestPath.get(v)+1);
                    //w.path = v;
                    w.path = v;
                    q.enqueue( w );
                }
            }
        }
        return new HashMap(shortestPath);
    }
    
    
    public String shortestPathsToString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Vertex, Integer> entry : shortestPath.entrySet()) {
            sb.append(entry.getKey()).append("->")
                    .append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Vertex, ArrayList<Vertex>> entry : adjVertices.entrySet()) {
            sb.append(entry.getKey()).append("->")
                    .append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
    
}
