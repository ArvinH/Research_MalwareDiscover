package netdb.graph.alg;

import java.util.List;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;

import netdb.graph.opts.framework.Walker;

public interface IGraphSearchVisitor {
	public void visitVertex(Vertex v, List<Edge> impactEdges, Walker walker); 
}
