/**
 * 
 */
package com.npickard;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author nigel
 *
 *
 */
public class HelloWorld {

	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	static Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {

		// Set up a simple configuration that logs on the console.
		BasicConfigurator.configure();

		logger.info("Hello World!");
	}
}
