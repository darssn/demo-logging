import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.console.AppService;



public class App {
	
	private static final Logger LOG=  LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");
		
		AppService as = new AppService();
		
		as.executer("ok"); // Root sur TRACE , Affiche Debug
	
	
	
	}
	
}
