package netdb.graph.unit;

import java.util.Date;

public interface Cacheable  {
	public boolean isExpired();
    public Object getIdentifier(); 
}
