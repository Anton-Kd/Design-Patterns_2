
import java.time.LocalDateTime;


public class Logger {
    private static Logger logger = null;
    private final LocalDateTime date = LocalDateTime.now();

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }
}