public class Logger {

    // Create only one instance
    private static Logger instance = new Logger();

    // Private constructor
    private Logger() {
    }

    // Method to return the same instance
    public static Logger getInstance() {
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}