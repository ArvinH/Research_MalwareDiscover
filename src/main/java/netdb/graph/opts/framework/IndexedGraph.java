package netdb.graph.opts.framework;

import java.util.List;

import netdb.graph.alg.IGraphSearchStrategy;
import netdb.graph.unit.CacheManager;

import com.tinkerpop.blueprints.Vertex;

public class IndexedGraph {
  private CacheManager blockCache = null;
  Vertex root=null;
  public Walker query(IGraphSearchStrategy queryStratgey) {
	  Walker walker = new Walker();
	  List<Vertex> nextV = queryStratgey.getNextVisitVertex(root, walker);
	  while (nextV != null) {
		  /**
		   * do something
		   */
		  nextV = queryStratgey.getNextVisitVertex(nextV.get(0), walker);
	  }
	  
	  return walker;
  }
}
