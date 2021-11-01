/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lwtgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Natalia Solar
 */
public class Vertex {
    Integer label;
    Vertex path;   // Previous vertex on shortest path
    Vertex( Integer label ) {
        this.label = label;
    }
    
    
    @Override
    public boolean equals( Object o ) {
        Vertex v = (Vertex) o;
        if( this.label.equals( v.label ))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
    
    @Override
    public String toString() {
        return label.toString();
    }

}
