package MyMavenProject.FirstProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
    private static final Logger logger = LogManager.getLogger(Log4j.class);

    public static void main(String[] args) {
        // Demonstrating different logging levels
    	logger.info("This is an INFO message.");
        logger.debug("This is a DEBUG message.");
        logger.trace("This is a TRACE message.");
        logger.fatal("This is a FATAL message.");
        logger.error("This is an ERROR message.");
        logger.warn("This is a WARN message.");
        

        // Logging to a file
        logger.info("Logging to a file.");

        // Logging in a custom format
        logger.info("User-specific format: Request from user {} at IP {}", "Subhajit", "192.168.0.1");
    }
}
