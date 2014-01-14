package netdb.graph.alg;

import java.util.List;

import netdb.graph.opts.framework.Walker;

import com.tinkerpop.blueprints.Vertex;

public interface IGraphSearchStrategy {
	
    public List<Vertex> getNextVisitVertex(Vertex v, Walker walker);
    public void accept(IGraphSearchVisitor vis);    
}
