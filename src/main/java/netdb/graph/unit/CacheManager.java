package netdb.graph.unit;

import java.util.TreeMap;

public class CacheManager {
   public static int BLOCK_CACHE_SIZE = 1000;
	private TreeMap map = null;
  
  private CacheManager() {
	  map = new TreeMap();
  }
  
  public void putCache(Cacheable object)
  {
	  if (map.containsKey(object.getIdentifier())) {
	    /*just update*/
	  }
	  else {
		  if (map.size() > BLOCK_CACHE_SIZE) {
			  cleanCache();
		  }
		  map.put(object.getIdentifier(), object);  
	  }
    
    
  }
  public void cleanCache() {
	  
  }
  public Cacheable getCache(Object identifier)
  {
      Cacheable object = (Cacheable)map.get(identifier);
      if (object == null)
       return null;
      if (object.isExpired())
      {
        map.remove(identifier);
        return null;
      }
      else
      {
        return object;
      }
  }  
}
