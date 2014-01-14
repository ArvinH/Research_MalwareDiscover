package netdb.graph.opts.framework;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.event.GraphEvent.Vertex;

public class Target extends Vertex {
    public String name;

	public Target(Graph source, Type type, Object vertex) {
		super(source, type, vertex);
		// TODO Auto-generated constructor stub
	}

}
