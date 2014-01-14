package netdb.graph.opts.framework.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import netdb.graph.opts.framework.OptsExperimentSet;

public class OptsExecutor {
	public OptsExecutor() {
    	Properties prop = new Properties();
    	try {
          prop.load(new FileInputStream("OptsProperties"));
          OptsExperimentSet.GRAPH_FILE = prop.getProperty("GRAPH_FILE");
    	} catch (IOException e) {
    		
    	}	
	}
	public static void main(String[] agrs) {
		
	}
}
