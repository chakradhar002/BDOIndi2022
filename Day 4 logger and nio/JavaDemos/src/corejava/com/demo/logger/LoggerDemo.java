package corejava.com.demo.logger;

import org.apache.log4j.Logger;

/* *
 * 
 *Need for Logging
It provides the complete tracing information of the application.
It records the critical failure if any occur in an application.
Components of Logging
The Java Logging components used by the developers to create logs and passes
 these logs to the corresponding destination in the proper format. 
 There are the following three core components of the Java logging API:

Loggers
Logging Handlers or Appender
Logging Formatters or Layouts
 */

class Add {

	private static final Logger log1 = Logger.getLogger(Add.class);

	void Add(int number1, int number2) {
		int c = number1 + number2;
		log1.info(" inside the  method Add()");
		log1.debug(log1);
	}

}

public class LoggerDemo {

	public static void main(String[] args) {

		Add t = new Add();
		t.Add(10, 20);
	}

}
