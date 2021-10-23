package week05;

public class Application {

  public static void main(String[] args) {
    Logger asLog = new AsteriskLogger();
    Logger spLog = new SpacedLogger();
    String[] logStrings = new String[]{
        "Hello", "This is a log", "Here's what happened"
    };
    String [] errStrings = new String[] {
        "Hello", "This is an error", "Everything went wrong"
    };
    System.out.println("Asterisk Logs:");
    logLoop(asLog, logStrings);
    System.out.println("Asterisk Errors:");
    errLoop(asLog, errStrings);
    System.out.println("Spaced Logs:");
    logLoop(spLog, logStrings);
    System.out.println("Spaced Errors:");
    errLoop(spLog, errStrings);
  }
  
  public static void logLoop(Logger log, String[] messages) {
    for (String mess:messages) {
      log.Log(mess);
    }
  }
  public static void errLoop(Logger log, String[] messages) {
    for (String mess:messages) {
      log.Error(mess);
    }
  }

}
