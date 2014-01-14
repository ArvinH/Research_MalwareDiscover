package netdb.graph.opts.framework;

import java.util.Date;

import netdb.graph.unit.Cacheable;

public class GBlock implements Comparable, Cacheable {
  /**
   * blueprint graph
   */
	public static final int MEMORY_GBLOCK = 0;
	public static final int DISK_GBLOCK = 1;
	
	private int b_type = -1;

    Date leastAccessTime = new Date();

	public boolean isExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


}
