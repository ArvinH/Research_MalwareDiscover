package netdb.graph.opts.framework;

import java.util.LinkedList;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;

public class Walker {
  private LinkedList<Vertex> visitedNodes;
  private LinkedList<Edge> visitedEdges;
  public Walker() {
	  visitedNodes = new LinkedList<Vertex>();
  }
  public void addNode(Vertex v) {
	  visitedNodes.add(v);
	  
  }
  public void addEdge(Edge e) {
	  visitedEdges.add(e);
	  
  }
  public Vertex getLeastNode() {
	  return null;
  }
  
  public String toString() {
	  return null;
  }
  public double getPathWeight() {
	  return -1;
  }
}
