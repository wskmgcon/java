import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class logdemo {
    private static final Logger logger = Logger.getLogger("HelloWorld");
    public static void main(String[] args) {
        logger.info("Hello, World!");
logger.setLevel(Level.FINER);
        ConsoleHandler handler=new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);
        logger.finest("Finest logging");
        logger.fine("fine logging");
        logger.finer("finer logging");
        //    logger.info("Logging in user " + logger.getName() + " with birthday " + logger.getResourceBundle());

    }
}