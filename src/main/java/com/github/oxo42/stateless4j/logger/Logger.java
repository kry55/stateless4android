package com.github.oxo42.stateless4j.logger;

public interface Logger { 
	
	void debug(String tag, String message);
	void warning(String tag, String message);
	void error(String tag, String message);
	
}
