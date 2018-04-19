import electric.glue.pro.console.services.Logging
import org.apache.log4j.Level
import org.apache.log4j.Logger

public class LoggingTest {
    Logger log;

    LoggingTest() {
        log = Logger.getLogger("com.acme.CreateSubtask");
        log.setLevel(Level.DEBUG);
    }

    public void debug(String text) {
        log.debug(text)
    }

}

LoggingTest lg = LoggingTest()
lg.debug("TESTING")